package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;
import java.util.logging.ErrorManager;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManger;


public class App {
	public static void main(String[] args) {
		
		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 insert  employee data");
		System.out.println("press 3 update employee data");
		System.out.println("press 4 delete employee data");
		
		System.out.println("press 5 search employee data");

		
		
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
		 case 1:
			 EmployeeDAO dao = EmployeeManger.getEmployeeDAO();
//			impl.getAllEmployeeData(); 
			 List<EmployeeBean> result = dao.getAllEmployeeData();
			 
			 
			 for(EmployeeBean bean :result) {
				 
				 System.out.println("Id: "+bean.getId());
				 System.out.println("NAME: "+bean.getName());
				 System.out.println("Salary: "+bean.getSal());
                 System.out.println("Gender: "+bean.getGender());
			 }
			 
			 break;
		 case 2:	
			 EmployeeDAOImpl impl1 =  new EmployeeDAOImpl();
			 
			 break;
		 case 3:	
			 EmployeeDAOImpl impl2 =  new EmployeeDAOImpl();
//			 impl1.
          break;
		 case 4:	
			 EmployeeDAOImpl impl3 =  new EmployeeDAOImpl();
//			 impl1.
			 break;
		 case 5:	
			 EmployeeDAO dao1 = EmployeeManger.getEmployeeDAO();
			 int id =  sc.nextInt();
			 EmployeeBean bean = dao1.searchEmployeeData(id);
			 dao1.searchEmployeeData(id);
			 if(bean!=null) {
				 
				 System.out.println("Id: "+bean.getId());
				 System.out.println("NAME: "+bean.getName());
                 System.out.println("Gender: "+bean.getGender());

				 System.out.println("Salary: "+bean.getSal());
			 }else {
                 System.out.println("NO Data found");	 
			 }
			 break;


 		}
		
		
		
		
		
	}

}
