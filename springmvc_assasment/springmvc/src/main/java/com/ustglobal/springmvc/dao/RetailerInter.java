package com.ustglobal.springmvc.dao;

import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;


public interface RetailerInter {
	
	
	public Retailer login(int id,String password);
	public Retailer searchProduct(int id);
	public int register(Retailer bean);
	public int registerproduct(Product bean);
	public Product searchorders(int id);
	public boolean changepassword(int id ,String password);

}
