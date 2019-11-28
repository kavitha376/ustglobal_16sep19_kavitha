package com.ustglobal.jpawithhibernetapps.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapps.onetomany.PencilBox;

public class TestManytoMany {
	public static void main(String[] args) {
        ArrayList<Course> course =new ArrayList<Course>();
		
		
		Course c = new Course();
		c.setCid(1);
		c.setCname("java");
		
		Course c1 = new Course();
		c1.setCid(2);
		c1.setCname("java");
		
		course.add(c);
		course.add(c1);
		
		
		
		Student s = new Student();
		s.setSid(20);
		s.setSname("pavi");
		s.setCourse(course);
		

		/*Student s1 = new Student();
		s1.setSid(4);
		s1.setSname("kavitha");
		s.setCourse(course);

		*/
   
		EntityManager em = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			em = entityManagerFactory.createEntityManager();
			entityTransaction = em.getTransaction();
			entityTransaction.begin();
		 em.persist(s);
//		 em.persist(s1);
//			PencilBox pb2 = em.find(PencilBox.class, 1);
//      		System.out.println(pb2.getPencil());
//			em.persist(p);
			System.out.println("Record saved");
			
            entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
       em.close();




	}

}
