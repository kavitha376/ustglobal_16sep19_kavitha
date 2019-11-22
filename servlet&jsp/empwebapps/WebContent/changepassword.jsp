<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>

<body>
<a href="./home">HOME</a>
<a style="float-right" href="./logout">LOGOUT</a>
<h4><%=msg %></h4>
<fieldset align="center">
<legend>changepassword.html</legend>
<form action="./changepassword" method="post">
<table align="center">
<tr>
   <td>NEW</td>
   <td><input type="text" name="password"></td><br>
</tr>
<tr>
   <td>CONF</td>
   <td><input type="text" name="confirmpassword"></td><br>
</tr>
<tr>  
<td><input type="submit" value="change"></td>
<td><input type="reset" value="Reset"></td>
</tr>
</table>
</form>
</fieldset>
</body>
</html>