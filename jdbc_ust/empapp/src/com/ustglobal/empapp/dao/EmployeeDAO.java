package com.ustglobal.empapp.dao;

import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAO {
	public List<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeData(int id);
	public int insertEmployeeData(int id ,String name,int sal ,String gender);
    public int UpdateEmployeeData(int id ,String name,int sal ,String gender);
    public int deleteEmployeeData(int id);
    

	

}
