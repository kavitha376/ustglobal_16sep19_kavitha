package ustglobal4;

public class TestB {

	static int b;

	static int a;
	{
		a=10;
		b=20;
		System.out.println("non static block 1");
	}
	public static void main(String[] args) {
		System.out.println("main method ");
		TestB b= new TestB();
		TestB b1 = new TestB();
		
		
		System.out.println("main method");
	}
	{
		System.out.println("non static block 2");
	}
	
}
