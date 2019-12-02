<%@page import="com.ustglobal.springmvc.dto.Product"%>
<%@page import="com.ustglobal.springmvc.dto.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
     Retailer bean =(Retailer)session.getAttribute("bean");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./login">login</a>
<a href="./changepassword">change password</a>
<a href="./logout">Logout</a>
<h2>Welcome<%=bean.getName() %></h2>
<fieldset>
<legend>Search Employee</legend>
<form action="./search" method="post">
<table>
  <tr>
  <td>ID:</td>
  <td><input type="number" name="id"></td>
  <td><input type="submit" value="search"></td>

</tr>
</table>
</form>
</fieldset>
<%
Product bean1= (Product)request.getAttribute("bean");
%>

<%
if(bean1!= null) {
%>

<table>
<tr>
<th>pId</th>
<th>pNAME</th>
<th>pprice</th>


</tr>
<tr>
<td><%=bean1.getId() %></td>
<td><%=bean1.getPname() %></td>
<td><%=bean1.getPrice() %></td>

</table>
<%
}
%>	
<h3>${msg}</h3>
</body>
</html>