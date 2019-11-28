package com.ustglobal.jpawithhibernetopertion.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@Column
	private int marks;
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
