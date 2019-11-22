package com.ustglobal.exception.first;

public class Irctc {
     void confirm() {
    	 System.out.println("IRCTC Started");
    	 try {
    	 System.out.println(10/2);
    	 }catch(ArithmeticException e)
    	 {
    		
    		 System.out.println("airthmetic exception");
    		 throw e;
    	 }
    	 System.out.println("IRCTC ended");
     }
}
