package com.ustglobal.springboot.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="employee")
public class EmployeeBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String gender;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date doj;
	@Column
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getGender() {
		return gender;
	}
	public Date getDoj() {
		return doj;
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
	public void setDoj(Date doj) {
		this.doj = doj;
	}

}
