package com.ustglobal.lambdaExpression;

public class TestMultiply {
	public static void main(String[] args) {
	MultiflyInterface multiply = (a,b)->a*b;
	int product = multiply.multifly(20, 30);
	System.out.println("product is " +product);
	}

}
