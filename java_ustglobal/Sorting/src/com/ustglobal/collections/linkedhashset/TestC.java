package com.ustglobal.collections.linkedhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	
	
	public static void main(String[] args) {
		
			LinkedHashSet hs = new LinkedHashSet();
			hs.add(34);
			hs.add("harshavardhan");
			hs.add(34.5);
			hs.add("kavitha gowda");
			hs.add(null);
			hs.add(null);
			hs.add(34);
			
			
			System.out.println("using for each");
			
			for(Object o:hs) {
				System.out.println(o);
			}
			
			System.out.println("************using itertor**********");
			
			Iterator it =hs.iterator();
			while(it.hasNext()) {
				Object s = it.next();
				System.out.println(s);
			}
		}

	}


