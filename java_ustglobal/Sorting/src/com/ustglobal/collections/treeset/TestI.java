package com.ustglobal.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		
		SortByName sn= new SortByName();
		SortByPin sp = new SortByPin();
		SortByMicro sm = new SortByMicro();

	TreeSet<Bank> ts = new TreeSet<Bank>(sm);
	Bank b1 = new Bank("HDFC",560068,6768);
	Bank b2 = new Bank("SbI ",560712,7886);
	Bank b3 = new Bank("citi" ,560792,7098);
	Bank b4 = new Bank("canara ",560754,7075);
	Bank b6 = new Bank("canara ",560754,7075);

	Bank b5 = new Bank("KBL ",560748,7834);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	ts.add(b6);
	
	
	System.out.println("*************using iterator**********");
	
	Iterator<Bank> it = ts.iterator();
	while(it.hasNext()) {
		Bank b =it.next();
		System.out.println("name is "+b.name);
		System.out.println("pincode is "+b.pincode);
		System.out.println("micr is "+b.micro);
	}



	
	
	}

}
