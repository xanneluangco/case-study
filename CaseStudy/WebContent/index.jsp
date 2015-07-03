<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<center>
<body>
<form action="/study/case?rh=employee" method="post">
<br><br>
Welcome!
<br><br>
<table>
	<tr>
		<td>Username: </td>
		<td><input type="text" name="username" required></td>
	</tr>
	<tr>
		<td>Password: </td>
		<td><input type="password" name="password" required> </td>
	</tr>
</table>
<br>
<input type="submit" name="login">
</form>
</body>
</center>
</html>
