package ustglobal3;

public class Testauto {
	
	public static void main(String[] args) {
		Automobile a ;
		Bmw b = new Bmw();
		b.gear();
		b.gps();
		b.abs();
		
		System.out.println("**************");
		
		Toyoto t = new Toyoto();
		t.gear();
		t.gps();
		
		
	}

}
