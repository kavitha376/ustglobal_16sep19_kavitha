package com.ustglobal.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;


public class TestC {
	

	public static void main(String[] args) {
		 ArrayList al1 = new ArrayList();
         al1.add(12);
         al1.add(233.44);
         al1.add("momo");
         al1.add(false);
         
         System.out.println("========using iterator=====");
         Iterator it = al1.iterator();
        
//         for(;it1.hasNext;) we can use this also by using
         
         while(it.hasNext()) {
       	  Object o =it.next();
       	  System.out.println(o);
         }
     
	}    
	
	
	
	
	

}
