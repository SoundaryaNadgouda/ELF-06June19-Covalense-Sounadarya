<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%int id=(Integer)request.getAttribute("userid") ;
String pwd=(String)request.getAttribute("password") ;
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
User id:<%=id %>
<br>
Password:<%=pwd %>
</body>
</html>