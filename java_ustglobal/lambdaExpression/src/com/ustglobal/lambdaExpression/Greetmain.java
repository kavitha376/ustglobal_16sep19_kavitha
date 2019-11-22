package com.ustglobal.lambdaExpression;

public class Greetmain {
	public static void main(String[] args) {
		Greet g = (message) -> {
			System.out.println("hello");
//			System.out.println(g.greet("hiii mad"));
			return message;
			
			};
			String s = g.greet("good morninh");
			System.out.println("wish u "+s);
			
			
	}
}