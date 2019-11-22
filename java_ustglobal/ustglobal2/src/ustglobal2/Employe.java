package ustglobal2;

public class Employe {

	
	String name;
	int eid;
	
	public Employe(String empname , int empid) {
		name = empname;
		eid = empid;
		
	}
	void printDetail() {
		System.out.println("Employee name is "+name );
		System.out.println("empolyee id is " +eid);
	}
	
	public static void main(String[] args) {
		Employe e = new Employe("kavitha",123);
		e.printDetail();
		Employe e2 = new Employe("harsha",420);
		e2.printDetail();
		Employe e3 = new Employe("kalpana",69);
		e3.printDetail();
//		System.out.println(e3.eid);
	}
}
