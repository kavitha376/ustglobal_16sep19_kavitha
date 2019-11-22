<%@page import="com.ustglobal.empwebapps.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
   EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");
%>
<%-- <jsp:useBean id="info" class="com.ustglobal.empwebapps.dto.EmployeeInfo"></jsp:useBean>
 --%>
 <body>
<a href='./home'>home</a>
		<a  style = 'float:right' href='./logout'>logout</a>
		<%if(info!=null){%>
		<fieldset>
		<legend>Employee Info</legend>
		<table align="center">
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		</tr>
		<tr>
		<td><%=info.getId() %></td>
		<td><%=info.getName() %></td>
		<td><%=info.getEmail() %></td>
		</tr>
		</table>
		
		</fieldset>
		<%} else{%>
		<h1>NO dada found</h1>
		<%} %>		

</body>
</html>