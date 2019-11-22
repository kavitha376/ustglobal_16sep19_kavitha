package ustglobal;

public class MobileGen
{
	public static void main(String[] args) {
		Secondgen s = new Secondgen();
		s.call();
		s.game();
		s.msg();
		
		System.out.println("*****************************");
		
		FirstGen f = new FirstGen();
		f.call();
		
		f.msg();
		
		
		System.out.println("********************");
		ThirdGen t = new ThirdGen();
		t.call();
		t.camera();
		t.wattsap();
		t.game();
		t.msg();
	}

}
