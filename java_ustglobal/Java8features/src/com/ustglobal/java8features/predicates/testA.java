package com.ustglobal.java8features.predicates;

import java.util.function.Predicate;

public class testA {
public static void main(String[] args) {
	
	Predicate<Employee> p = e->{
		if(e.salary>=30.00) {
			return true;
		}else {
			return false;
		}
	};
	
	
	Employee  e = new Employee(1,"kavi",34.56);
	boolean res = p.test(e);
	System.out.println("Result: "+res);
}
}
