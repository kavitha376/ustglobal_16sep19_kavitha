package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	@Override
	public int compareTo(Laptop l1) {
		String p = this.name.toLowerCase();
		String q = l1.name.toUpperCase();
		return p.compareToIgnoreCase(q);
		
	}
//	@Override
//	public int compareTo(Laptop l1) {
//		if(this.price>l1.price) {
//			return 1;	
//		}
//		else if(this.price<l1.price) {
//			return -1;
//			
//		}
//		else {
//			return 0;
//		}
//		
//	}
//	@Override
//	public int compareTo(Laptop l1) {
//		if(this.ram>l1.ram) {
//			return 1;	
//		}
//		else if(this.ram<l1.ram) {
//			return -1;
//			
//		}
//		else {
//			return 0;
//		}
//		
//	}
	

}
