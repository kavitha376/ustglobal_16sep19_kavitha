package com.ustglobal.springmvc.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	@InitBinder
	public void inintBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		
		binder.registerCustomEditor(Date.class, editor);
	}
	
	
	@RequestMapping(path = "/hello")
	public String hello(@RequestParam("name")String name,
			            @RequestParam("id") int id,
	                        	ModelMap map) {
		map.addAttribute("msg" ,"Hello world");
		map.addAttribute("name",name);
		map.addAttribute("id", id);
		
		return "index";
	}
	
	@RequestMapping(path = "/hi/{name}/{id}")
	public String hi(@PathVariable("name") String name,
			@PathVariable("id") int id,
			HttpServletRequest request) {
		request.setAttribute("msg","hello java world");
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		return "index";
	}
	@RequestMapping(path= "/form")
	public String formpage() {
		return "form";
	}
	
	
	
	@RequestMapping(path ="/form", method=RequestMethod.POST)
	public String form(Employee employee,ModelMap map) {
	
		map.addAttribute("id", employee.getId());
		map.addAttribute("name", employee.getName());
		map.addAttribute("password", employee.getPassword());
		map.addAttribute("gender", employee.getGender());
		map.addAttribute("doj", employee.getDoj());
		return "formoutput";
	}

	@RequestMapping(path = "/create-cookie")
	public String createCookie(ModelMap map,
			HttpServletResponse response) {
		
		Cookie cookie = new Cookie("name", "divaya");
		response.addCookie(cookie);
		return "createcookie";
		
	}
	@RequestMapping(path = "/read-cookie")
	public String readCookie(@CookieValue(name="name",required = false)String name,ModelMap map) {
		
		map.addAttribute("name", name);
		return "readcookie";
		
	}
	@RequestMapping(path = "/redirect")
	public String redirect() {
		return "redirect:https://www.facebook.com";
		
	}
	@RequestMapping(path = "/forword")
	public String forward() {
		return "forward:hi/kavi/1";
	}
}
