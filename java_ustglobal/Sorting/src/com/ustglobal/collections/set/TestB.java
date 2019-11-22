package com.ustglobal.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("ammulya");
		hs.add("harshavardhan");
		hs.add("ashwini");
		hs.add("kavitha gowda");
		hs.add("pragya");
		hs.add("pallavi");
		hs.add("ranjana");
		
		
		System.out.println("using for each");
		
		for(String s:hs) {
			System.out.println(s);
		}
		
		System.out.println("************using itertor**********");
		
		Iterator<String> it =hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}


}
