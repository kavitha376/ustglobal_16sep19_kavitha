package com.ustglobal.HashMap;

import java.util.HashMap;

public class testA {
	
	public static void main(String[] args) {
		HashMap hm =  new HashMap();
		hm.put("kavi", 987799);
		hm.put("mala", 66897);
		hm.put("sheela", 89756);
		hm.put(null, 1234);
		hm.put(null, 45678);
		
		System.out.println("data is "+hm);
		hm.put("mala", 68897);
		System.out.println("after modifcation"+hm);
		
		hm.put("dimple", 68897);
		System.out.println("after dimple"+hm);
		
		System.out.println("after null"+hm);
		
		System.out.println("***************");
		System.out.println("after adding duplicate null");
		System.out.println(hm);
		
		Object phono = hm.get("sheela");
		
		System.out.println("value "+phono);
		
		System.out.println("*******************");
		
         Object phneono = hm.get("she");
		
		System.out.println("value "+phneono);
		
		System.out.println("after remove -------->"+hm);
		
		Object value = hm.remove("kavi");
			System.out.println("value "+value);
			
			
		
		
		
		

	}

}
