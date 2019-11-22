package com.ustglobal.beanobject;

public class TestA {
    public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("shiva");
		s.setHeight(5);
		Database d = new Database();
		d.receive(s);
		
		Employee e = new Employee();
		e.setId(21);
		e.setName("harshaVardhan gowda");
		e.setSalary(234546);
		
		
		
	}
}
