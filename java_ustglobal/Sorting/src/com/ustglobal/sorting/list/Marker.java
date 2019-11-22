package com.ustglobal.sorting.list;

public class Marker  implements Comparable<Marker>{

	int price;
	String color = "red";
	public Marker(int price, String color) {
		super();
		this.price = price;
		this.color = color;
	}
	@Override
	public int compareTo(Marker arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
