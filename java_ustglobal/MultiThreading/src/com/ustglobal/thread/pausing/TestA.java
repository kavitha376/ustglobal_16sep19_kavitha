package com.ustglobal.thread.pausing;

public class TestA {
	public static void main(String[] args) {
		
	
	Object ob1 = new Object();
	Object ob2 = new Object();
	
	Runnable r1 = () -> {
		synchronized (ob1){
			
			System.out.println("T1 started");
			System.out.println("T1 has lokcked obj1");
			try {
				ob1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (ob2) {
				
				System.out.println("T1 has locked ob2");
//				ob1.notify();
			}
			
			
		}
		System.out.println("T1 finished");
	};

	
	
	Runnable r2 = () ->{
		synchronized (ob2) {
			System.out.println("T2 started");
			System.out.println("T2 has locked obj2");
			
			synchronized (ob1) {
				System.out.println("T2 has locked ob1");
//				ob1.notify();
				ob1.notifyAll();
			}
		}
		System.out.println("T2 finished");
	};
	
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();
	
}
	
}
