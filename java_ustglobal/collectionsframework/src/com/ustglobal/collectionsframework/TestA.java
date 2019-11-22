package com.ustglobal.collectionsframework;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(12.3);
		al.add(22.5);
		al.add(true);
		al.add(null);
		al.add('a');
		al.add(12);
		al.add("harshavardhan");
		al.add(2);
		
		Object o = al.get(2);
		System.out.println(o);
		

		for(int i = 0; i<6 ;i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}
		
		
		
	}

}
