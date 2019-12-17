package com.ustglobal.springsrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springsrest.dto.EmployeeBean;
@Repository
public class EmployeeDaoImpl  implements EmployeeDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		try {
			transaction.begin();
			manger.persist(bean);
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		
		
			
		transaction.begin();
		EmployeeBean employeeBean =manger.find(EmployeeBean.class, bean.getId());
		employeeBean.setName(bean.getName());
		employeeBean.setGender(bean.getGender());
		employeeBean.setPassword(bean.getPassword());
		employeeBean.setDoj(bean.getDoj());
		transaction.commit();
		return true;
		
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
         transaction.begin();
		EmployeeBean bean =manger.find(EmployeeBean.class,id);
		if(bean!=null) {
			manger.remove(bean);
			transaction.commit();
			return true;
		}else {
			return false;
		}

	}

	@Override
	public EmployeeBean getEmployee(int id) {
		EntityManager manger = factory.createEntityManager();
		EmployeeBean bean = manger.find(EmployeeBean.class, id);


		return bean;
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		String jpql = "from EmployeeBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query= manager.createQuery(jpql,EmployeeBean.class);
		List<EmployeeBean> employeeBeans = query.getResultList();
		return employeeBeans;

	}




}
