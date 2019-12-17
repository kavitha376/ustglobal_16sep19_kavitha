package com.ustglobal.springsrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springsrest.dao.EmployeeDAO;
import com.ustglobal.springsrest.dto.EmployeeBean;
@Service
public class EmployeeServiceImpl implements EmployeeService{
   @Autowired
	private EmployeeDAO dao;
	
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.addEmployee(bean);
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		else {
		return dao.modifyEmployee(bean);
	}
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		return dao.getEmployee(id);
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		return dao.getAllEmployee();
	}
	

}
