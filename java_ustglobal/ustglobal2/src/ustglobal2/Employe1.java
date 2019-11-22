package ustglobal2;

public class Employe1 {
	String name;
	int eid;

	public Employe1(String name , int eid) {
		this.name = name;
		this.eid = eid;

	}
	void sayHello(){
		System.out.println("hello  "+name+"  welcome to ust global company");
	}
	void printDetail() {
		System.out.println("Employee name is "+name );
		System.out.println("empolyee id is " +eid);
		this.sayHello();
	}

	public static void main(String[] args) {
		Employe1 e = new Employe1("kavitha",123);
		e.printDetail();
		Employe1 e2 = new Employe1("harsha",420);
		e2.printDetail();
		Employe1 e3 = new Employe1("kalpana",69);
		e3.printDetail();
		//			System.out.println(e3.eid);
	}
}



