package com.ustglobal.collectionsframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		Vector  li = new Vector();
		
		
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
		System.out.println("=======using for each=====");
		for (Object object : li) {
			System.out.println(object);
			
		}
		System.out.println("======using iterator=======");
				Iterator it =li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
	}
		System.out.println("====== list using iterator=======");
		ListIterator lt1 = li.listIterator();
		while(lt1.hasNext()) {
			System.out.println(lt1.next());
			
		}
		
		System.out.println("====list iterator backword====");
		while(lt1.hasPrevious()) {
			System.out.println(lt1.previous());
		}
	}

}

	


