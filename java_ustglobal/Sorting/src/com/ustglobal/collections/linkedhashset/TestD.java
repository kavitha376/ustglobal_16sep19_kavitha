package com.ustglobal.collections.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	
	public static void main(String[] args) {
		
	
	LinkedHashSet<Double> hs = new LinkedHashSet();
	hs.add(34.9);
	hs.add(10.4);
	hs.add(34.5);
	hs.add(12.4);
	hs.add(78.0);
	hs.add(54.8);
	hs.add(34.2);
	
	
	System.out.println("using for each");
	
	for(Object o:hs) {
		System.out.println(o);
	}
	
	System.out.println("************using itertor**********");
	
	Iterator<Double> it =hs.iterator();
	while(it.hasNext()) {
		Object s = it.next();
		System.out.println(s);
	}
}

	

}
