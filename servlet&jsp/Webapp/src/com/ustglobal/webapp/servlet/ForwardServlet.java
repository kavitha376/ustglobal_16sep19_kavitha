package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>is forword serivice</h1>");
		out.println("</body>");
		out.println("</html>");

		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/first");
		
		
		
		Object obj = new Object();
		req.setAttribute("obj", obj);
		
//		RequestDispatcher dispatcher1 = req.getRequestDispatcher("/first");
		
		dispatcher.forward(req, resp);
	}

}
