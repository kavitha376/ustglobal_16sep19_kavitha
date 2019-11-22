package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Deletecookies extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		Cookie[] cookies =req.getCookies();
		PrintWriter out = resp.getWriter();
		
		if(cookies==null) {
			out.println("<h1>no cookie found</h1>");
		}else {
			for (Cookie cookie : cookies) {
				String name = cookie.getName();
				if(name.equals("emp-name")) {
					
					cookie.setMaxAge(0);
					out.println("<h1>for emp-name cookie value is deleted");
//					out.println(cookie.getValue());
//					out.println("</h1>");
				}
			}
		}
		

		
	}

}
