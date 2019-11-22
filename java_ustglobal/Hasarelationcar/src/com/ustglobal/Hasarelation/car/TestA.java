package com.ustglobal.Hasarelation.car;

public class TestA {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("name of the car "+c.name);
		System.out.println("name of the song is "+c.m.name);
		c.m.songs();
		c.drive();
		c.horn();
		
	}

}
