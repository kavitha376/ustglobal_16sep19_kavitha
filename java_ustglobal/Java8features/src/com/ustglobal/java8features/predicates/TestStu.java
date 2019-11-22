package com.ustglobal.java8features.predicates;

import java.util.ArrayList;

public class TestStu {
	public static void main(String[] args) {
		ArrayList<Student>  al = new ArrayList<Student>();
		al.add(new Student(5,"vikki",56.7));
		al.add(new Student(6,"mikki",26.7));
		al.add(new Student(4,"pinki",46.7));
		al.add(new Student(1,"kavitha",33.75));
		al.add(new Student(2,"kavya",96.7));
		al.add(new Student(3,"kavi",23.7));
		
		
		Helper h = new Helper();
		h.displayAllStudent(al);
		h.dispalyFailedStudents(al);
//		System.out.println("************");
		h.dispalyTopperStudents(al);
	}

}
