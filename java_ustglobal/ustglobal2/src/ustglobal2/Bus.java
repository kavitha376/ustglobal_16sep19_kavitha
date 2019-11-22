package ustglobal2;

public class Bus {
	
	int seats;
	String color;
	  Bus(int seats , String color){
		  this.seats = seats;
		  this.color = color;
	  }
	  Bus(){
		  this(40);
	  }
	  Bus(int seats)
	  {
		  this(seats ,"red");
	  }
	  void getData() {
		  System.out.println("welcome to redbud, bus seat capacity is"+seats);
	  }

}
