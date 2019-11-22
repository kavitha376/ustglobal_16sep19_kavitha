package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestMarker {
	public static void main(String[] args) {
LinkedList<Marker> l = new LinkedList<Marker>();
		
Marker m = new Marker(50,"writo");
Marker m1 = new Marker(10,"renods");
Marker m2 = new Marker(39,"glow");
Marker m3 = new Marker(34,"santhor");
		
		l.add(m);
		l.add(m1);
		l.add(m2);
		l.add(m3);
		
		displayMarkerDetails(l);
		SortByPrice sb = new SortByPrice();
		SortByColor sc = new SortByColor();


		Collections.sort(l,sb);
		Collections.sort(l,sc);

		
		System.out.println("after sorting");
		displayMarkerDetails(l);

		
		
		
	}
   static void displayMarkerDetails(LinkedList<Marker> l) {
		Iterator<Marker> it =  l.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("cost is"+m.price);
			
			System.out.println("brand is "+m.color);
		}
		
		
	}
	
		
		
		
		
		
	}


