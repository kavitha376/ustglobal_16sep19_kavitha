package ustglobal;

public class TestB {
	public static void main(String[] args) {
		
		Cow c = new Cow();
		c.name = "gowri";
		c.color = "blockwhite";
		System.out.println("name of the cow "+c.name);
		System.out.println("color of cow "+c.color);
		c.eat();
		c.sleep();
		
		System.out.println(".......................");

		Cow c1 = new Cow();
		c1.name = "mangla";
		c1.color = "brown";
		System.out.println("name of the cow "+c1.name);
		System.out.println("color of cow "+c1.color);
		c1.eat();
		c1.sleep();
		

		
	}

}
