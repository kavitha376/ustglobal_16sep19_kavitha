package com.ustglobal.java8features.predicates;

import java.util.function.Consumer;

public class TestCum {

	public static void main(String[] args) {
		Consumer<Student> c = s->{
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("**************");
		};
		
		Student s1 = new Student(2, "bhavani", 67.8);
		c.accept(s1);
	}
}
