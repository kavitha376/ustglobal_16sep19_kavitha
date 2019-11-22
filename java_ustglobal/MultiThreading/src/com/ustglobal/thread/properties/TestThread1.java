package com.ustglobal.thread.properties;

public class TestThread1 {
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("main startd"
				);
		
		
		MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		System.out.println("main thread ended");
		
		
	}

}
