package com.ustglobal.empwebapps.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapps.dao.EmployeeDAO;
import com.ustglobal.empwebapps.dao.EmployeeDaoManger;
import com.ustglobal.empwebapps.dto.EmployeeInfo;
@WebServlet("/changepassword")
public class ChangepasswordServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		HttpSession session = req.getSession(false);
		if(session!=null) {
			String pass = req.getParameter("password");
			String confirmpass = req.getParameter("confirmpassword");
			
			if(pass.equals(confirmpass)) {
				EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
			EmployeeDAO dao = EmployeeDaoManger.getEmployeeDAO();
			dao.changePassword(info.getId(), pass);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
			
			
			}else {
				
				String msg= "password not matching";
				req.setAttribute("msg", msg);
				RequestDispatcher dispatcher = 
						req.getRequestDispatcher("/changepassword.jsp");
				dispatcher.forward(req, resp);
			}
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		
	}

}
