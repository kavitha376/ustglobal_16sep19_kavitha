package ustglobal;

public class TestE {
	public static void main(String[] args) {
		Student s = new Student();
		
		Student.CLGname = "Atria institue of technology";
		s.name = "kavitha gowda";
		s.usn = 15036;
		System.out.println("student collage name: " +Student.CLGname);
		System.out.println("student name: "+s.name);
		System.out.println("student usn: " +s.usn);
		s.read();
		
		
		System.out.println("******************************");
		System.out.println("student name is "+Student.CLGname);
		System.out.println("student usn ");
	}

}
