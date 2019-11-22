package com.ustglobal.Stream.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(20);
		marks.add(23);
		marks.add(45);
		marks.add(5);
		marks.add(24);
		marks.add(4);
		
		List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = l.iterator();
		System.out.println("sorted------->");
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}

}
