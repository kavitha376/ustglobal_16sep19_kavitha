package com.ustglobal.collections.treeset;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPQ {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		
		pq.add(33);
		pq.add(1);
		
		System.out.println("");
System.out.println("*************using iterator**********");
		
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
	}

}
