package com.ustglobal.beanobject;

public class TestB {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(12);
		e.setSalary(120000);
		e.setName("kavitha gowda");
		e.setDept(2);
		e.setDesignation("software devloper");
		
		Databases1 db = new Databases1();
		db.show(e);
		
	}

}
