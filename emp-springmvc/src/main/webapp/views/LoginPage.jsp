<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	   <form action="./login" method="post"></form>
	   <br><br>
	   ${msg}
	User name: <input type="text" name="username">
	Password : <input type="password"  name="password">
	<br><br>
	<button>Login</button>
	<button>Cancel</button>

</body>
</html>