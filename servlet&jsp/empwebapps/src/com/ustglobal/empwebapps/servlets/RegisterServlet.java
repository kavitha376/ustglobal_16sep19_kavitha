package com.ustglobal.empwebapps.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.empwebapps.dao.EmployeeDAO;
import com.ustglobal.empwebapps.dao.EmployeeDaoManger;
import com.ustglobal.empwebapps.dto.EmployeeInfo;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		int id= Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		EmployeeInfo info = new EmployeeInfo();
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);
		
		
		EmployeeDAO dao = EmployeeDaoManger.getEmployeeDAO();
	 boolean check =dao.registerEmployee(info);
	
	 
	 PrintWriter out = resp.getWriter();
	 String msg="";
	 if(check) {
		 msg = "Registeration completed";
		 
	}else {
		msg="Id cannot be repeated";
		
	}
	 req.setAttribute("msg", msg);
	 RequestDispatcher dispatcher =
			 req.getRequestDispatcher("./login.jsp");
      dispatcher.forward(req,resp);
	}
}