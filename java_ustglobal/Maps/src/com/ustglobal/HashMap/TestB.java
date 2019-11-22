package com.ustglobal.HashMap;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("kavi", 1234);
		hm.put("mala", 6789);
		hm.put("riya", 34567);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 789965);
		hm1.put("kirit", 6789909);
		hm1.put("kuku", 55663);
		
		boolean hasKey = hm.containsKey("mala");
		System.out.println("has key "+hasKey);
		
		boolean hasValue = hm.containsValue(6789);
		System.out.println("has Value "+hasValue);
		
		
		
		hm.putAll(hm1);
		
		System.out.println("*******************");
         System.out.println("after put all "+hm);
         
         System.out.println(hm.size());
         
         boolean isEmpty=hm.isEmpty();
         System.out.println("map is empty "+isEmpty);
         
         hm.clear();
         System.out.println("after clear "+hm);
		
	}

}
