package com.ustglobal.beanobject;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Scanner class");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the age");
		int age = sc.nextInt();
		

		System.out.println("enter the name");
       String name = sc.next();
		System.out.println("Age is "+age);

       
		System.out.println("name is "+name);
	}

}
