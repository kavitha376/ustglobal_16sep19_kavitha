package com.ustglobal.empwebapps.dao;

public class EmployeeDaoManger {

	private EmployeeDaoManger() {}
	
	public static EmployeeDAO getEmployeeDAO() {
		
		return new  EmployeeDAOjdbcImpl();
	}
	
}
