package com.ustglobal.springmvc.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="order")
public class Order {
	@Id
	@Column
	private int orderid;
	@Column
	private int quantity;
	@Column
	private double amount;
	
	/*@Exclude
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id",nullable=false)
	private List<Retailer> re;
	*/
	
	
	
}
