package com.ustglobal.jpawithhibernetapps.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.omg.CORBA.Object;

import com.ustglobal.jpawithhibernet.dto.Products;

public class RetriveData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		String jpql= "from Products ";
		String jpql = " select pname from Products";
		Query query = entityManager.createQuery(jpql);
	

	    List<Products> a =  query.getResultList();

		
	   /* for (Products product : a) {
	    	System.out.println(product.getPid());
	    	System.out.println(product.getPname());
	    	System.out.println(product.getQuantity());
			
		     
	    	
	    }
	    */
	    for (int i = 0; i < a.size(); i++) {
	    	
	       java.lang.Object obj = a.get(i);
	    	System.out.println(obj);
	    	
			
		}
	    
		
		
		
		
	}

}
