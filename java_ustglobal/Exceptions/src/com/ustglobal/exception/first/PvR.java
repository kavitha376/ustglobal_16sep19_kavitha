package com.ustglobal.exception.first;

public class PvR {
	void book() {
		try {
			System.out.println("booking strted");
			System.out.println(10/0);
			System.out.println("login for booking");
			System.out.println("booking confirmed");
		}catch(ArithmeticException e) {
			System.out.println("booking cancelled");
			throw e;
		}
	}

}
