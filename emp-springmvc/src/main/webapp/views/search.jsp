<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.dto.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Management Portal</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
.nav {
	background-color: beige;
}

.profile {
	height: 50px;
	width: 20px;
	background-color: blueviolet
}

.logout {
	font-size: 25px;
	color: brown;
	font-weight: 600;
}

.employee-info {
	border: 1px solid brown;
}

.data-display {
	font-size: 18px;
	padding: 5px;
}
</style>
</head>
<body>
	<div style="background-color: beige;">
		<h1 style="margin-left: 35%">Employee Management Portal</h1>
		<div class="row" style="height: 70px; padding: 20px;">
			<div class="col-1 profile">
				<span></span>
			</div>
			<div class="col-5">
				<span class="logout">Edit</span>
			</div>
			<!-- <div class="search col-2">
				<form action="./validator/validate/employee/search" method="Get">
					<input hidden type="text" name="url" placeholder="Search"
						name="search" />
			</div> -->
			</form>
			<div class="col-3">
				<a href="./logout"> <span class="logout"
					style="margin-left: 70%;">Logout</span></a>
			</div>
		</div>
	</div>
	<br>
	<br>
	<%	List<EmpInfoBean> bean=(List<EmpInfoBean>)request.getAttribute("bean"); %>
	<div class="employee-info container">
		<%if(bean!=null) {%>
		
		<div class="data-display">ID:${b.getId()} </div>
		<div class="data-display">Name:${b.getName()}</div>
		<div class="data-display">Account Number:
			${b.getAcno()}</div>
		<div class="data-display">Email Id: ${b.getEmail()}</div>
		<div class="data-display">Age:${b.getAge()}</div>
		<div class="data-display">Designation:${b.getDesignation()}
		</div>
		<div class="data-display">Department Id:
			${b.getDeptid()}</div>
		<div class="data-display">Manager Id:${b.getManagerid()}</div>
		<div class="data-display">Phone:${b.getPhone()}</div>
		<div class="data-display">Gender:${b.getGender()}</div>
		<div class="data-display">Date of birth:${b.getDob()}</div>
		<div class="data-display">Date of Joining:
			${b.getJoiningDate()}</div>
		<div class="data-display">Salary: ${b.getSalary()}</div>
	</div>
		<%
		
		}
else  %>
		<div class="data-display">No Result Found</div>

	</div>
</body>
</html>