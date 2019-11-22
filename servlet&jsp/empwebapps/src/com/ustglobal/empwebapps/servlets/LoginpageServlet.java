package com.ustglobal.empwebapps.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/login.html")
public class LoginpageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp)
		PrintWriter out = resp.getWriter();
		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysrember")) {
				
				id = cookie.getValue();
			}
		}
		
		}	
		out.println("<html>");
		out.println("<fieldset align='center'>");
		out.println("<legend>login.html</legend>");
		out.println("<table align='center'>");
		out.println("<form   action='./login' method='post'>");
		out.println("<tr>");
		out.println("<td>ID</td>");
		out.println("<td><input type='number' name='id' value=' "+id+"'></td><br>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>PASSWORD</td>");
		out.println("<td><input type='password' name='password'></td><br>");
		out.println("</tr>");
		out.println("<tr>");
		out.println( "<td><input type='checkbox' name='remberme' value='checked'></td>");
		out.println("<td>remeber me</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='reset' value='Reset'></td>");
		out.println( "<td><input type='submit'  name='submit value='login'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("<a href='./Register.html'>Register</a>");
		out.println("</fieldset>");
		
		
		out.println("</html>");
		
		
	}
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doGet(req, resp);
    }
}
