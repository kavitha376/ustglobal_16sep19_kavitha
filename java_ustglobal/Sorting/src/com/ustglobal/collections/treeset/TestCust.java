package com.ustglobal.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCust {

	public static void main(String[] args) {
		SortById si = new SortById();
		TreeSet<Customer> ts= new TreeSet<Customer>(si);
		Customer c = new Customer(1,"kavi",67.09);
		Customer c1 = new Customer(8,"ammu",89.09);
		Customer c2 = new Customer(6,"pammi",44.09);

		Customer c3 = new Customer(5,"timma",34.09);
		Customer c4 = new Customer(4,"timmi",23.09);

		ts.add(c);
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
//		ts.add(c5);
		
		
		System.out.println("*************using iterator**********");
		
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer ck =it.next();
			System.out.println("name is "+ck.name);
			System.out.println("id  is "+ck.id);
			System.out.println("slary is "+ck.salary);
		}

		
		
	}
	
}
