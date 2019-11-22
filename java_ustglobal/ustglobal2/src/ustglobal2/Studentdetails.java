package ustglobal2;

public class Studentdetails 
{
	
	String name;
	int age;
	int marks;
	String clgname;
	String fatherName;
	String address;
	Studentdetails(String name,int age,int marks,String clgname,String fatherName,String address)
	{
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.clgname = clgname;
		this.fatherName = fatherName;
		this.address = address;
		
	}
	
	void printDetail() {
		System.out.println("student name is "+name );
		System.out.println("student age is " +age);
		System.out.println("student marks is "+marks );
		System.out.println("student collage is " +clgname);
		
		System.out.println("student fathername is "+fatherName );
		System.out.println("student adress is " + address);
		
		
	}
	
 public static void main(String[] args) {
	 Studentdetails s = new Studentdetails("kavi",21,80,"pes","mallappa","jp nagar");
	 s.printDetail();
	 System.out.println("********************");
	 Studentdetails s1 = new Studentdetails("ravi",21,90,"atria","chandru","allasandra");
	 s1.printDetail();
	 System.out.println("********************");

	 Studentdetails s2 = new Studentdetails("kavitha",51,70,"atria","chandru","malleswaram");
	 s2.printDetail();
	 System.out.println("********************");

	 Studentdetails s3 = new Studentdetails("ramya",41,70,"atria","manju","jayanagar");
     s3.printDetail();
	 System.out.println("********************");

	 Studentdetails s4 = new Studentdetails("kavi",31,70,"atria","chada","doddbalpur");
     s4.printDetail();
	 System.out.println("********************");

	 Studentdetails s5 = new Studentdetails("praggy",21,70,"pes","prabhu","nagavara");
     s5.printDetail();
	 System.out.println("********************");

	 Studentdetails s6 = new Studentdetails("simba",28,30,"atria","ayyappa","oldtown");
     s6.printDetail();
	 System.out.println("********************");

	 Studentdetails s7 = new Studentdetails("kavya",26,80,"nit","manju","hebbal");
        s7.printDetail();
   	 System.out.println("********************");

	 Studentdetails s8 = new Studentdetails("nikki",23,90,"atria","bharath","oldtown");
    s8.printDetail();
	 System.out.println("********************");

	 Studentdetails s9 = new Studentdetails("harsha",21,70,"atria","lakkegowda","nes");
	 s9.printDetail();
	 System.out.println("********************");

	 Studentdetails s10 = new Studentdetails("ammu",23,50,"pes","appanna","basvangudi");
    s10.printDetail();

}
}
