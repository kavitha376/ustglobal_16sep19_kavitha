package com.ustglobal.exception.first;

public class TestG {
	public static void main(String[] args) {
		System.out.println("main started");
		
		Paytm p = new Paytm();
		try {
		p.book();
		}
		catch(ArithmeticException ae) {
		System.out.println("exception cought in main");
		}finally {
			System.out.println("exceuting finally");
		}
		System.out.println("main ended");

	}

}
