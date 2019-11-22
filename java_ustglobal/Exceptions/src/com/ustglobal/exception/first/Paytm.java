package com.ustglobal.exception.first;

public class Paytm {
	
	void book() {
		System.out.println("payTm started");
		
		Irctc i = new Irctc();
		try {
		i.confirm();
		}
		catch(Exception e) {
			System.out.println("error in paytm");
			throw e;
		}
		System.out.println("payTm ended");
	}

}
