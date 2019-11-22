package com.ustglobal.collections.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestK {
	
	public static void main(String[] args) {
		TreeSet<Employee> hs = new TreeSet<Employee>();
		Employee e1 = new Employee(12,"kavi",45000);
		Employee e2 = new Employee(18,"teju",35000);
		Employee e3 = new Employee(24,"giri",55000);
		Employee e4 = new Employee(2,"ashu",49000);
		Employee e5 = new Employee(1,"ashu",35000);
		
		hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        hs.add(e4);
        hs.add(e5);
        
        System.out.println("*************using itertor******");
        
        Iterator<Employee> it = hs.iterator();
        while(it.hasNext()) {
        	Employee e = it.next();
        	System.out.println("Id is "+e.id);
        	System.out.println("Name is "+e.name);
        	System.out.println("Salaray is"+e.salary);
        }

		
	}

}
