<%@page import="com.covalense.emp.dto.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%UserBean userBean=(UserBean)request.getAttribute("userBean");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BeanDisplay</title>
</head>
<body>
User id:<%=userBean.getUserid() %>
<br>
Password:<%=userBean.getPassword() %>
</body>
</html>