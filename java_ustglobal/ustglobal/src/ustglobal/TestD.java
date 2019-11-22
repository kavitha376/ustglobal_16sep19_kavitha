package ustglobal;

public class TestD {
	public static void main(String[] args) {
		Btm b = new Btm();
		b.swip();
		
		Btm b1 = new Btm();
		b1.swip();
		
		b.getCount();
		b.getTotalCount();
		
		int count = b.getCount();
		System.out.println("count is "+count);
		
		int total = b.getTotalCount();
		System.out.println("totalcount is "+count);
		
	}

}
