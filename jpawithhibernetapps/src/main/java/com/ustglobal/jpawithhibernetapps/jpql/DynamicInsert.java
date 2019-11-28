package com.ustglobal.jpawithhibernetapps.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsert {
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction et = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
//		String jpql= "from Products ";
		 et= entityManager.getTransaction();
		String jpql = "insert into Products(pid,pname,quantity) values(:id,:name,:quantity)";
		et.begin();
		Query query = entityManager.createNativeQuery(jpql);
		query.setParameter("id", 105);
		query.setParameter("name", "laptop");
		query.setParameter("quantity", 15);
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
