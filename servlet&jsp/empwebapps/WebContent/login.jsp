<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<%
String id = "";
Cookie[] cookies = request.getCookies();
if(cookies!=null) {
for (Cookie cookie : cookies) {
	if(cookie.getName().equals("alwaysrember")) {
		
		id = cookie.getValue();
	}
}

}	

%>
<body>
<h4><%=msg%></h4>
<fieldset align='center'>
<legend>login</legend>

<table align='center'>
<form   action='./login' method='post'>
<tr>
      <td>ID</td>
      <td><input type='number' name='id' value='<%=id %>'></td><br>
      
</tr>  
<tr>
      <td>PASSWORD</td>    
     <td><input type='password' name='password'></td><br><br>
</tr>
<tr>     
      <td><input type='checkbox' name='remberme' value='checked'></td>
      <td>remeber me</td>
      
</tr>
<tr>   
     <td><input type='reset' value='Reset'></td>   
    <td><input type='submit'  name='submit value='login'></td>
</tr>

</table>
</form>
 <a href='./Register.html'>Register</a>
</fieldset>

</body>
</html>s