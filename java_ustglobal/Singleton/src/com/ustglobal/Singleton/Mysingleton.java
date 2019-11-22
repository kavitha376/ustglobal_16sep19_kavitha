package com.ustglobal.Singleton;

public class Mysingleton {
	private static Mysingleton instance = null;
	String s = "hello";
	private Mysingleton() {
		
		
	}
	public static Mysingleton getDbConnection() {
		if(instance == null) {
			instance = new Mysingleton();
			return instance;
			
		}
		else {
			return instance;
		}
	}
	
}
