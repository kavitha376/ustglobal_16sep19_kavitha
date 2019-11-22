package com.ustglobal.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
    public static void main(String[] args) {
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("banglore",560068);
		lh.put("hariyan", 134203);
		lh.put("patna", 880000);
//		lh.put(null, 67986);
		
		for (Map.Entry<String, Integer>  m :lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key +"--------"+"value "+value);
			System.out.println("*********************");
		}
		
		
		
	}
}
