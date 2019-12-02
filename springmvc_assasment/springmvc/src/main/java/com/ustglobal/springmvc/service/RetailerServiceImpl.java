package com.ustglobal.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvc.dao.RetailerInter;
import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;

@Service
public class RetailerServiceImpl implements RetailerService {
     @Autowired
	private RetailerInter dao;
	
	@Override
	public Retailer login(int id, String password) {
		
		return dao.login(id, password);
	}

	@Override
	public Product searchProduct(int id) {
		
		return dao.searchorders(id) ;
	}

	@Override
	public int register(Retailer bean) {
		
		return dao.register(bean);
	}

	@Override
	public Retailer searchorders(int id) {
	
		return dao.searchProduct(id);
	}

	@Override
	public boolean changepassword(int id, String password) {
		
		return dao.changepassword(id, password);
	}

	@Override
	public int registerproduct(Product bean) {
		
		return dao.registerproduct(bean);
	}

	
}
