package ustglobal;

public class TestC
{
	public static void main(String[] args) 
	{
		Person p =new Person();
		p.name = "ammulu";
		p.age = 21;
		Person.color = "brown";
		System.out.println( "person name is "+p.name);
		System.out.println(" person age is "+p.age);
		System.out.println("person color is "+Person.color);
		p.eat();
		p.walk();
		System.out.println("********************************");
		Person.color = "red";
		System.out.println(Person.color);
       System.out.println("..............................");
		Person p1 =new Person();
		p1.name = "kavitha";
		p1.age = 22;
		Person.color = "brown";
		System.out.println( "person name is "+p1.name);
		System.out.println(" person age is "+p1.age);
		System.out.println("person color is "+Person.color);
		p1.eat();
		p1.walk();

	}

}
