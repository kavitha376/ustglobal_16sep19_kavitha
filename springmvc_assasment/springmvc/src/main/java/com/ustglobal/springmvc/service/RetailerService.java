 package com.ustglobal.springmvc.service;

import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;

public interface RetailerService {
	public Retailer login(int id,String password);
	public Product searchProduct(int id);
	public int register(Retailer bean);
	public Retailer searchorders(int id);
	public int registerproduct(Product bean);

	public boolean changepassword(int id ,String password);


}
