package com.ustglobal.jpawithhibernetapps;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Products;

public class InsertDemo {
	public static void main(String[] args) {
		
		Products product = new Products();
		product.setPid(101);
		product.setPname("pen");
		product.setQuantity(10);
		
		product.setPid(102);
		product.setPname("colgate");
		product.setQuantity(5);
		
		product.setPid(103);
		product.setPname("pencile");
		product.setQuantity(6);
		

		product.setPid(104);
		product.setPname("popcorn");
		product.setQuantity(6);
		
		EntityTransaction entityTransaction = null;
		EntityManager  entityManager = null;
		try {
			
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("Records saved");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
		
		
		
		
		
	}

}
