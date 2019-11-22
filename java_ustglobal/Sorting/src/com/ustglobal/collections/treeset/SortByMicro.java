package com.ustglobal.collections.treeset;

import java.util.Comparator;

public class SortByMicro  implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		Integer a = o1.micro;
		Integer a1 = o2.micro;
		return a.compareTo(a1);
	}

	
}
