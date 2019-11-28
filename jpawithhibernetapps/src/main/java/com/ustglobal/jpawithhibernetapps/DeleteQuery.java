package com.ustglobal.jpawithhibernetapps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteQuery {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction et = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
//		String jpql= "from Products ";
		 et= entityManager.getTransaction();
		String jpql = "delete from Products  where pid=103";
		et.begin();
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		System.out.println(result);
		et.commit();
		}catch (Exception e) {
         e.printStackTrace();
		  et.rollback();
		}
		entityManager.close();
		
		
	}

}
