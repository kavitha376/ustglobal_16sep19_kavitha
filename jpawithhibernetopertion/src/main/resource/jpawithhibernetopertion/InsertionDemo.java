package jpawithhibernetopertion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetopertion.dto.Student;

public class InsertionDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setSid(1);
		student.setSname("kavitha");
		student.setMarks(56);
		
		student.setSid(2);
		student.setSname("thavitha");
		student.setMarks(80);
		student.setSid(3);
		student.setSname("thavi");
		student.setMarks(87);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory emEntityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = emEntityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		System.out.println("records saved");
		entityTransaction.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
	}	
		
	

  }
