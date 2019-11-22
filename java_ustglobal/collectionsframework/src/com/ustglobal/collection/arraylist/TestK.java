package com.ustglobal.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(23.4);
		al.add(87.6);
		al.add(34.5);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		al.add(2,54.6);
		System.out.println("after add in 2nd index"+al);
		al.remove(0);
		System.out.println("after removeing 0th index "+al);
		al.remove(null);
		System.out.println("after removing null"+al);
		Double val = al.get(4);
		System.out.println("Object at 4th index "+val);
		al.set(2, 77.6);
		System.out.println("after replacing 2nd index "+al);
		al.clear();
		
		System.out.println("after clear method " +al);
		al.contains(56.4);
		
		List<Double> al1 =new ArrayList<Double>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		al.addAll(al1);
		System.out.println("after add all "+al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("removeed all of al1 "+contain);
		
		boolean res = al.removeAll(al1);
		System.out.println("removeed all of al1 "+res);
		
		
		
	}

}
