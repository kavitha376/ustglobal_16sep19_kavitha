package com.ustglobal.Stream.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(23);
		al.add(45);
		al.add(5);
		al.add(24);
		al.add(4);
		
		List<Integer> l =
				  al.stream().map(i-> i+50).collect(Collectors.toList());
					
					
					for(Integer i :l) {
						System.out.println(i);
					}
					}
	}


