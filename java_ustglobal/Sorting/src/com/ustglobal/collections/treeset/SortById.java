package com.ustglobal.collections.treeset;

import java.util.Comparator;

public class SortById  implements Comparator<Customer>{

			@Override
			public int compare(Customer o1, Customer o2) {
				
				Integer a = o1.id;
				Integer a1 = o2.id;
				return a.compareTo(a1);
			}


}
