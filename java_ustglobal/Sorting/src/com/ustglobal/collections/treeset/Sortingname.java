package com.ustglobal.collections.treeset;

import java.util.Comparator;

public class Sortingname  implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		String a = o1.name;
		String a1 = o2.name;
		return a.compareTo(a1);
	}


}
