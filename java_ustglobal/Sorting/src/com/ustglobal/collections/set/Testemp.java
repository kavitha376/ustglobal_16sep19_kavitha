package com.ustglobal.collections.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Testemp {

	public static void main(String[] args) {

		Comparator<Employee> com = (e1,e2) -> {
			if(e1.height > e2.height) {
				return 1;
			}else if(e1.height <e2.height) {
				return -1;
			}
			else {
				return 0;
			}
		};
		TreeSet<Employee> ts = new TreeSet<Employee>(com);


		Employee e1 = new Employee(4,"nikki",5.6);
		Employee e2 = new Employee(2,"mommy",4.7);
		Employee e3 = new Employee(1,"pammi",5.9);

		Employee e4 = new Employee(5,"nimmi",5.5);

		Employee e5 = new Employee(3,"kavi",5.2);



		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);

		System.out.println("*************using iterator***********");
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("height is "+e.height);
			System.out.println("*****************************");
		}

	}

}
