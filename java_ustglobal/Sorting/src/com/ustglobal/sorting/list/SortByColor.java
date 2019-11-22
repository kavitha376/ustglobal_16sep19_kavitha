package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByColor implements  Comparator<Marker>{

	@Override
	public int compare(Marker o1, Marker o2) {
		String i = o1.color;
		String i2 = o2.color;
		
		
		return i2.compareTo(i);
	} 

}
