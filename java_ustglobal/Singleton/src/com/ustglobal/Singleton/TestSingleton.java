package com.ustglobal.Singleton;

public class TestSingleton {
	public static void main(String[] args) {
		Mysingleton ms = Mysingleton.getDbConnection();
		ms.s = "hello";
		System.out.println("hascode of ms "+ms.hashCode());
		Mysingleton mx = Mysingleton.getDbConnection();
		mx.s = "hi";
		System.out.println("hashcode of mx "+mx.hashCode());
		System.out.println(ms.s);
		System.out.println(mx.s);
	}

}
 