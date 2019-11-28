package com.ustglobal.jpawithhibernetopertion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetopertion.dto.Student;

public class ReadData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student student = entityManager.find(Student.class, 1);
		
		System.out.println("student is ---"+student.getSid());
		System.out.println("Student name is---"+student.getSname());
		System.out.println("student marks is---"+student.getMarks());
		
	}

}
