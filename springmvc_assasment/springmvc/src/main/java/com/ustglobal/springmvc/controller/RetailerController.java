package com.ustglobal.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;
import com.ustglobal.springmvc.service.RetailerService;

@Controller
public class RetailerController {
	
	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@PostMapping("/login")
	public String login( int id ,String password,HttpServletRequest request) {
		Retailer bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
			
		}
	}//end of login()
	@GetMapping("/register")
	public String registePage() {
		return "register";
	} // end of register page
	@PostMapping("/register")
	public String register(Retailer bean,ModelMap map) {
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "you are Registered and Id is"+check);
		}else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	@GetMapping("/search")
	public String searchorder(@RequestParam("id") int id,
			ModelMap map) {
		
		Product bean = service.searchProduct(id);
		
		if(bean==null) {
			map.addAttribute("msg", "Data Not Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}// end of search()
	@GetMapping("/changepassword")
	public String changepassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null) {
		return "changepassword";
		}else {
			return "login";
		}
	}
	@PostMapping("/changepassword")
	public String changepassword(String password,
  			String confirmpassword,@SessionAttribute(name="bean")Retailer bean,ModelMap map) {
           
		 if(password.equals(confirmpassword)) {
		   service.changepassword(bean.getId(), password);
		   map.addAttribute("msg","password Changed");
		
		 }else {
			   map.addAttribute("msg","password  Not Changing");

			 
		 }
		return "home";
	}
}
