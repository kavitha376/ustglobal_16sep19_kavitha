package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		LinkedList<Laptop> l1 = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(25000,4,"Hp");
		Laptop lp2 = new Laptop(35000,6,"Dell");
		Laptop lp3 = new Laptop(15000,12,"Asus");
		Laptop lp4 = new Laptop(80000,8,"Mac");
		Laptop lp5 = new Laptop(50000,12,"lenovo");
		
		l1.add(lp1);
		l1.add(lp2);
		l1.add(lp3);
		l1.add(lp3);
		l1.add(lp4);
		
		l1.add(new Laptop(20000,2,"acer"));
		System.out.println("before sorting-------");

		displayLaptopDetails(l1);
		Collections.sort(l1);
		System.out.println("after sorting------------");
		displayLaptopDetails(l1);

		

	}
	static void displayLaptopDetails(LinkedList<Laptop>l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("brand is "+lp.name);
			System.out.println("price is "+lp.price);
			System.out.println("ram is "+lp.ram);
		}
	}

}
