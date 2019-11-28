package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	int empId = Integer.parseInt(req.getParameter("id"));
	PrintWriter out = resp.getWriter();
//	String search = req.getParameter("search");
//	Connection conn = null;
//	Statement stmt = null;
//	ResultSet rs = null;
	try {
	String sql = "select * from employee_info where id =?";
	String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";

	Class.forName("com.mysql.jdbc.Driver");

		
//
//	String url1 ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		try (Connection conn = DriverManager.getConnection(url);
				PreparedStatement  stmt = conn.prepareStatement(sql);
               ResultSet  rs1 = stmt.executeQuery();
				){

			if(rs1.next()) {
				
				int id = rs1.getInt(1);
				String name =rs1.getString(2);
				int sal = rs1.getInt(3);
				String gender = rs1.getString(4);
				out.println("<table border:2px");
				out.println("<tr>");
				out.println("<th>id</th>");
				out.println("<th>name</th>");
				out.println("<th>sal</th>");
				out.println("<th>gender</th>");
				out.println("</tr>");
				out.println("</table>");
				
				
				out.println("<td>"+id+"</td>");
				out.println("<td>"+name+"</td>");
				out.println("<td>"+sal+"</td>");
				out.println("<td>"+gender+"</td>");
//				out.println("<td>"+id+"</td>");
				
				
				
				
			}else {
				out.println("not found");
			}
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

}
