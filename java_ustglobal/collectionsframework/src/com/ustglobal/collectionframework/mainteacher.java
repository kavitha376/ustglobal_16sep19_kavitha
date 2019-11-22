package com.ustglobal.collectionframework;

import java.util.ArrayList;



public class mainteacher {
	
	public static void main(String[] args) {
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		Teacher t1 = new Teacher(101,"anikitha", 78);
		Teacher t2 = new Teacher(102,"nikitha", 65);
		Teacher t3 = new Teacher(103,"pikitha", 47);
		
		al.add(t1);
		al.add(t2);
		al.add(t3);
		
		for (int i = 0; i < al.size(); i++) {
			Teacher t = al.get(i);
			System.out.println("Id is "+t.id);
			System.out.println("Name is "+t.name);
			System.out.println("salary is "+t.salary);
			
			
		}
		
		System.out.println("*******************using for each***********");
		for(Teacher t:al) {
			System.out.println(t);
		}
		

		
		
	}

	
	

}
