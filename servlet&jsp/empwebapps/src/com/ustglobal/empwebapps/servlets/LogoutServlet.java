package com.ustglobal.empwebapps.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		HttpSession session = req.getSession(false);
		if(session!=null) {
			session.invalidate();
		}
		RequestDispatcher dispatcher =
				req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
		
	}
	

}
