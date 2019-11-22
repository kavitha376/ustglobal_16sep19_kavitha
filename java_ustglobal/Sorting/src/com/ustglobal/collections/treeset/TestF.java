package com.ustglobal.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("kavi");
		ts.add("jaya");
		ts.add("ramya");
		ts.add("sushma");
		ts.add("nirma");
		ts.add("navya");
		ts.add("kavya");
		
		
		System.out.println("using for each");
		
		for(String s:ts) {
			System.out.println(s);
		}
		
		System.out.println("************using itertor**********");
		
		Iterator<String> it =ts.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

		
		
		
		
	
	}


