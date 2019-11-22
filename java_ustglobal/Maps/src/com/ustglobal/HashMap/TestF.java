package com.ustglobal.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		Student s1 = new Student(2,"divya",67.89);
		Student s2 = new Student(3,"sharuk",97.89);
		Student s3 = new Student(1,"ruthik",77.89);
		Student s4 = new Student(5,"ambika",97.69);
		Student s5 = new Student(9,"ammu",69.69);
		Student s6 = new Student(4,"annya",57.19);
		Student s7 = new Student(7,"kavi",47.00);
		Student s8 = new Student(6,"harsha",37.00);
		Student s9 = new Student(8,"kaya",17.00);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		
		ArrayList<Student> first = hm.get("second");
		Iterator<Student> it = first.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is"+s.name);
			System.out.println("Percentage  "+s.perentage);
			System.out.println("*********************");
		}
		

	}

}
