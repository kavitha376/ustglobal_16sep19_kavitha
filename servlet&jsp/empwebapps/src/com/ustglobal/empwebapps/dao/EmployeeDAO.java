package com.ustglobal.empwebapps.dao;

import com.ustglobal.empwebapps.dto.EmployeeInfo;

public interface EmployeeDAO {
	public EmployeeInfo auth(int id,String password);
	public EmployeeInfo searchEmployee(int id);
	public boolean changePassword(int id,String password);
	public boolean registerEmployee(EmployeeInfo info);
	

}
