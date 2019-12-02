package com.ustglobal.springmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;
@Repository
public class RetailerDao  implements RetailerInter{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public Retailer login(int id, String password) {
		String jpql = "from Retailer where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
//		javax.persistence.Query query = manager.createQuery(jpql); 
		TypedQuery<Retailer> query=
				manager.createQuery(jpql, Retailer.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
//		EmployeeBean bean = (EmployeeBean)query.getSingleResult();
			Retailer bean = query.getSingleResult();

		return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;

		}
		
	}

	@Override
	public Retailer searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Retailer.class, id);
	}

	@Override
	public int register(Retailer bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction et = manager.getTransaction();
		et.begin();
		try {
			manager.persist(bean);
			et.commit();
			return bean.getId() ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return -1;
	}
		

	@Override
	public Product searchorders(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changepassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction et = manager.getTransaction();
		et.begin();
        Retailer bean2 =manager.find(Retailer.class, id);
		bean2.setPassword(password);
		et.commit();
		
		return true;
	}

	@Override
	public int registerproduct(Product bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction et = manager.getTransaction();
		et.begin();
		try {
			manager.persist(bean);
			et.commit();
			return bean.getId() ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return -1;
	}

		

}
