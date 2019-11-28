package com.ustglobal.jpawithhibernet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //to make class as entity
@Table(name="product")
public class Products {
	@Id    //to map id primary key
	@Column   //to map database
	private int pid;
	@Column
	private String pname;
	@Column
	private int quantity;
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
