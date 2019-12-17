<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset align="center">register
<form action="./form" method="post">

<table>

<tr>
<td>id</td>
<td><input type="number" name="id"></td>
</tr>
<tr>
<td>name</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>password</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>gender</td>
<td><input type="text" name="gender"></td>
</tr>
<tr>
<td>DOJr</td>
<td><input type="date" name="doj"></td>
</tr>

<tr>
<td><input type="reset" value="Reset"></td>
<td><input type="submit" value="Register"></td>
</tr>
</table>

</form>
</fieldset>
</body>
</html>