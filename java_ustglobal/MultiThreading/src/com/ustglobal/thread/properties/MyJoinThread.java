package com.ustglobal.thread.properties;

public class MyJoinThread extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);  //it is a static method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
