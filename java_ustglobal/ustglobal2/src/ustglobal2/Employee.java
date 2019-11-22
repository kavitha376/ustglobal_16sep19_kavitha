package ustglobal2;

public class Employee {
		String name;
		int eid;
		long aadharno;
		Employee(String name, int eid, long aadharno){
			this.name = name;
			this.eid = eid;
			this.aadharno =aadharno;
			
		}
		Employee(String name,int eid){
			this.name = name;
			this.eid = eid;
		}
		Employee(int eid,String name){
			this.eid = eid;

			this.name = name;
			
		}
		void printDetail() {
//			System.out.println("Employee name is "+name );
//			System.out.println("empolyee id is " +eid);
//			System.out.println("employee adhar no is "+aadharno);
			System.out.println("hey " +name+" welcome to ust global");
		}
		
	

}
