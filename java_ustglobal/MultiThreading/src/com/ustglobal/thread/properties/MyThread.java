package com.ustglobal.thread.properties;

public class MyThread  extends Thread{
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		String tname = Thread.currentThread().getName();
		System.out.println("current thread "+tname);
		
		MyThread t1 = new MyThread();
		String mname =t1.getName();
		System.out.println("MyThread name "+mname);   //name
		 
//		Thread.currentThread().setName("bala");
		
		
		Thread.currentThread().setName("pammi");      //pammi
		
		t1.setName("golu");
		System.out.println("MyThread name  "+t1.getName()); //golu
		
		System.out.println(10/0);
		
		System.out.println("main ended");
		
		
		
	}

}
