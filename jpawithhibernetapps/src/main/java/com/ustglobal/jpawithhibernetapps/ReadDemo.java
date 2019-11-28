package com.ustglobal.jpawithhibernetapps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Products;

public class ReadDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
          Products  products = entityManager.find(Products.class,101);
        
          
          System.out.println("ID------"+products.getPid());
          System.out.println("Name is----"+products.getPname());
          System.out.println("quantity is---"+products.getQuantity());
          entityManager.close();
		
		
	}
	
	

}
