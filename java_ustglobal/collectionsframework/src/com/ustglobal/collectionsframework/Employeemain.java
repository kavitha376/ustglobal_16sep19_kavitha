package com.ustglobal.collectionsframework;

import java.util.ArrayList;

public class Employeemain {
	public static void main(String[] args) {
		
	ArrayList<Employee> al = new ArrayList<Employee>();
	Employee e1 = new Employee(101,"anikitha", 45);
	Employee e2 = new Employee(102,"kavitha", 65);
	Employee e3 = new Employee(103,"poojitha", 47);
	
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	for (int i = 0; i < al.size(); i++) {
		Employee e = al.get(i);
		System.out.println("Id is "+e.id);
		System.out.println("Name is "+e.name);
		System.out.println("slary  is "+e.salary);
		
		
	}
	
	System.out.println("*******************using for each***********");
	for(Employee e:al) {
		System.out.println(e);
	}
	

	}
	

}
