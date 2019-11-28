package com.ustglobal.jpawithhibernetapps;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Products;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager  entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		  entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		Products products = entityManager.find(Products.class, 101);
		products.setPname("laptop");
		System.out.println("update records");
		entityTransaction.commit();
		entityManager.close();
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
		
		
	}
		
		
		
	}

}
