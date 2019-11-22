package com.ustglobal.collections.treeset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreetSet {
public static void main(String[] args) {
	
	TreeSet ts = new TreeSet();
	ts.add(34);
	ts.add(45);
	ts.add(35);
	ts.add(13);
	ts.add(16);
	ts.add(90);
	ts.add(34);
	
	
	System.out.println("using for each");
	
	for(Object o:ts) {
		System.out.println(o);
	}
	
	System.out.println("************using itertor**********");
	
	Iterator it =ts.iterator();
	while(it.hasNext()) {
		Object s = it.next();
		System.out.println(s);
	}
}

	
	
	
	
	
}

