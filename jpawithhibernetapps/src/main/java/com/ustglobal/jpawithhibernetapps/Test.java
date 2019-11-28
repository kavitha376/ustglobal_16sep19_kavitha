package com.ustglobal.jpawithhibernetapps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapps.onetoone.Person;
import com.ustglobal.jpawithhibernetapps.onetoone.VoterCard;

public class Test {

	public static void main(String[] args) {

		 VoterCard v = new VoterCard();
		 v.setVid(3);
		 v.setVname("kavi");
		
		Person p = new Person();
		p.setPid(1);
		p.setName("yash");
		p.setVotercard(v);

		EntityManager em = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			em = entityManagerFactory.createEntityManager();
			entityTransaction = em.getTransaction();
			entityTransaction.begin();
			VoterCard vCard = em.find(VoterCard.class, 3);
			System.out.println(vCard.getPerson().getPid());
//			em.persist(p);
			System.out.println("inserted");
			
            entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
       em.close();







	}

}
