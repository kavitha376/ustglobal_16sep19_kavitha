package ustglobal3;

public class Bmw  implements Automobile,Automobilewithabs{
	
	 public int gear() {
		System.out.println("gear() methos");
		return 10;
	}
	 public void gps() {
		 System.out.println("gps() method");
	 }
	
	public void abs() {
      System.out.println("abs() in bmw");		
	}

}
