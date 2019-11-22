package ustglobal;

public class TestA {
	public static void main(String[] args) {


		Pen p= new Pen();
		p.cost = 10;
		p.color = "red";
		p.brand = "renods";
		
		
		p.write();
		System.out.println("cost is" +p.cost);
		System.out.println("color is"+p.color);
		System.out.println("brand is "+p.brand);
		
		System.out.println("...................................");
		Van v = new Van();
		v.cost = 50000;
		v.color = "green";
		System.out.println("cost of van "+v.cost);
		System.out.println("color of van   "  +v.color);
		v.move();
 
		System.out.println("...................................");
		Van v1 = new Van();
		v1.cost = 20000;
		v1.color = "yellow";
		System.out.println("cost of van "+v1.cost);
		System.out.println("color of van   "  +v1.color);
		v1.move();
		System.out.println("...................................");
		

		


	}


}
