package com.ustglobal.collectionsframework;

import java.util.ArrayList;

public class TestE {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("shilpa");
		
		
		Object o = al.get(0);
		String name = (String ) o;
		
		name = name.toLowerCase();
		System.out.println(name);
		
		
		
	}

}
