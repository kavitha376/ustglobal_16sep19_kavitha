package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPrice  implements Comparator<Marker>{

	@Override
	public int compare(Marker o1, Marker o2) {
		Integer i = o1.price;
		Integer i2 = o2.price;
		
		
		return i.compareTo(i2);
	}
	
	

}
