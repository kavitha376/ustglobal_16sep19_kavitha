package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("giriji");
		al.add("vanaja");
		al.add("jalalja");
		al.add("kiran");
		
		System.out.println("before sorting -----> "+al);
		Collections.sort(al);
		System.out.println("after sorting ----> "+al);
	}

}
