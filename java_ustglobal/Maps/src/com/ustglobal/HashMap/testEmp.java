package com.ustglobal.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class testEmp {

	public static void main(String[] args) {
		
		Employee e = new Employee(1,"kavi",30.56);
		Employee e1 = new Employee(3,"kavya",20.56);
		Employee e2 = new Employee(5,"pragya",19.06);
		Employee e3 = new Employee(4,"pavi",26.96);
		Employee e4 = new Employee(2,"ravi",34.26);
		Employee e5 = new Employee(7,"kavi",45.36);
		Employee e6 = new Employee(6,"timma",56.46);
		Employee e7 = new Employee(8,"timmi",89.66);
		Employee e8 = new Employee(9,"nimmi",37.56);
		Employee e9 = new Employee(10,"prana",60.56);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e3);
		al1.add(e4);
		al1.add(e5);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e6);
		al2.add(e7);
		al2.add(e8);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		
		ArrayList<Employee> second = hm.get("second");
		Iterator<Employee> it = second.iterator();
		
		while(it.hasNext()) {
			Employee em = it.next();
			System.out.println("Id is "+em.id);
			System.out.println("Name is"+em.name);
			System.out.println("salary "+em.salary);
			System.out.println("*********************");
		}
		
		
		
	}
}
