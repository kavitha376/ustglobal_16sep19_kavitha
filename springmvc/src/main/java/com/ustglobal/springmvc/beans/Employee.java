package com.ustglobal.springmvc.beans;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String password;
	private String gender;
	private Date doj;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getPassword() {
		return password;
	}
	public String getGender() {
		return gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
