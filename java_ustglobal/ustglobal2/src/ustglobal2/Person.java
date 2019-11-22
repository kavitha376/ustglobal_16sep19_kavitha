package ustglobal2;

public class Person {

	String name;
	int age;

	Person(String pname, int page)
	{
		name = pname;
		age = page;
	

	}
	void printDetail() {
		System.out.println("Employee name is "+name );
		System.out.println("empolyee id is " +age);
	}
	
 public static void main(String[] args) {
	 Person p = new Person("kavitha" , 20);
	 Person p1 = new Person("ashwini" , 10);
	 Person p2 = new Person("pragya" , 30);
	 Person p3 = new Person("ranjana" , 22);

		

}

}
