package com.ustglobal.springmvc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column
	private int id;
	@Column
	private String pname;
	@Column
	private double price;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="orderid",nullable=false)
	private Order order;
	
	@JoinTable(name="order_details",joinColumns=@JoinColumn(name="pname"),
	inverseJoinColumns=@JoinColumn(name="id"))
	
	private  Retailer ret;

}
