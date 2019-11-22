package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPen {
	
	public static void main(String[] args) {
		LinkedList<Pen> l = new LinkedList<Pen>();
		
		Pen p = new Pen(20,"cello");
		Pen p1 = new Pen(10,"renods");
		Pen p2 = new Pen(40,"writo");
		Pen p3 = new Pen(15,"santhor");
		
		l.add(p);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		
		displayPenDetails(l);
		Collections.sort(l);
		System.out.println("after sorting");
		displayPenDetails(l);

		
		
		
	}
   static void displayPenDetails(LinkedList<Pen> l) {
		Iterator<Pen> it =  l.iterator();
		while(it.hasNext()) {
			Pen p = it.next();
			System.out.println("cost is"+p.price);
			
			System.out.println("brand is "+p.brand);
		}
		
		
	}


}
