package com.ustglobal.Stream.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(24);
		al.add(23);
		al.add(12);
		al.add(4);
		al.add(22);
		al.add(3);
		
		
	List<Integer> l =
  al.stream().filter(i-> i%3 == 0).collect(Collectors.toList());
	
	
	for(Integer i :l) {
		System.out.println(i);
	}
	}


}
