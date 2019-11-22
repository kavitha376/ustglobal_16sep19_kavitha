package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookiesServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		Cookie cookie = new Cookie("emp-name", "Guruji");
		
		cookie.setMaxAge(1000);
		resp.addCookie(cookie);
		PrintWriter out = resp.getWriter();
		out.println("<h1>Cookie created</h1>");
		
		
	}  //end of do get

}
