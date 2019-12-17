package com.ustglobal.springsrest.dto;

import java.util.List;

public class EmployeeResponse {
	
	private int statuscode;
	private String message;
	private String description;
	private List<EmployeeBean> employeeBean;
	public int getStatuscode() {
		return statuscode;
	}
	public List<EmployeeBean> getEmployeeBean() {
		return employeeBean;
	}
	public void setEmployeeBean(List<EmployeeBean> employeeBean) {
		this.employeeBean = employeeBean;
	}
	public String getMessage() {
		return message;
	}
	public String getDescription() {
		return description;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
