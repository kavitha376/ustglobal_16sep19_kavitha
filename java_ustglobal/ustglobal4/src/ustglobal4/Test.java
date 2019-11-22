package ustglobal4;

public class Test {
	
	static int a;
	int b;
	static {
		a=10;
		System.out.println("static block1");
	}
	Test(){
		System.out.println("testA()  constructor");
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test();
		System.out.println("a value "+a);
	}
	static {
		a=20;
		System.out.println("static blocks 2");
	}
	static{
		a=40;
		System.out.println("static blocks 3");
	}

}
