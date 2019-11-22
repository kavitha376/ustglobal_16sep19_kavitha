package com.ustglobal.HashMap;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101,"ajay");
		ht.put(102, "vijay");
		ht.put(100, "sonu");
		ht.put(99, "monu");
		ht.put(105, "aj");
		ht.put(200, "ax");
		ht.put(201, "jj");
//		ht.put(null, "john"); Null pointerexception 
		
//		ht.put(108, null);
		
		
		
		
		System.out.println("Data "+ht);
	}

}
