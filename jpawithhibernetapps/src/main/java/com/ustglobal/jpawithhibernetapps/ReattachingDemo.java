package com.ustglobal.jpawithhibernetapps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Products;

public class ReattachingDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Products p = entityManager.find(Products.class, 101);
			System.out.println(entityManager.contains(p));

			entityManager.detach(p);
			System.out.println(entityManager.contains(p));
			Products p2 = entityManager.merge(p);
			
			p2.setPname("manu");
			System.out.println("updated");
			entityTransaction.commit();

		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
