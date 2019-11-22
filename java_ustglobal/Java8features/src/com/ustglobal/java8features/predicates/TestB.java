package com.ustglobal.java8features.predicates;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {


		Predicate<Teachers> p = t->{
			if(t.id<=4) {
				return true;
			}else {
				return false;
			}
		};


		Teachers  t = new Teachers(7,"kavi","maths");
		boolean res = p.test(t);
		System.out.println("Result: "+res);
	}
}


