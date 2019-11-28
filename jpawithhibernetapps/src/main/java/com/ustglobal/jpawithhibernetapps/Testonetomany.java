package com.ustglobal.jpawithhibernetapps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapps.onetomany.Pencil;
import com.ustglobal.jpawithhibernetapps.onetomany.PencilBox;
import com.ustglobal.jpawithhibernetapps.onetoone.VoterCard;

public class Testonetomany {


	public static void main(String[] args) {
		PencilBox b = new PencilBox();
		b.setBid(1);
		b.setBname("appsara");
		
		Pencil p = new Pencil();
		p.setPid(2);
		p.setPcolor("red");
		p.setPencilbox(b);
		
		Pencil p1 = new Pencil();
		p1.setPid(3);
		p1.setPcolor("pink");
		p1.setPencilbox(b);
		
		
		EntityManager em = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			em = entityManagerFactory.createEntityManager();
			entityTransaction = em.getTransaction();
			entityTransaction.begin();
//			 em.persist(p);
//			 em.persist(p1);
			PencilBox pb2 = em.find(PencilBox.class, 1);
      		System.out.println(pb2.getPencil());
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
