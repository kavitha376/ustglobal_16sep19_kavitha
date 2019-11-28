package com.ustglobal.jpawithhibernetapps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Products;

public class DeleteDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;	
		EntityTransaction entityTransaction = null;
		try {
			
			 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager  =entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			 Products products = entityManager.find(Products.class, 1);
			 entityManager.remove(products);
			 System.out.println("removed");
			 entityTransaction.commit();
			 
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}

}
