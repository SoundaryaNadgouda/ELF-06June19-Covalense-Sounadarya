<%@page import="org.springframework.web.servlet.support.ServletUriComponentsBuilder"%>
<%@page import="com.covalense.emp.dto.EmpInfoBean"%>
<%
String baseURL=ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
%>
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

.search-button {
	border: none;
	background-color: beige;
	margin-top: -26px;
	margin-left: -60px;
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
	
		<h1 style="margin-left: 35%">Employee Management Portal </h1>
		<div class="row" style="height: 70px; padding: 20px;">
			<div class="col-1 profile">
				<span></span>
			</div>
			<div class="col-5">
				<span class="logout">Edit</span>
			</div>
			<div class="search col-2">
				<form action="<%=baseURL%>/validator/validate/employee/search" method="Get">
					<input type="text" placeholder="Search" name="id" />
				</form>
			</div>
			<div class="col-3">
				<a href="./logout"><span class="logout"
					style="margin-left: 70%;">Logout</span></a>
			</div>
		</div>
	</div>
	<br>
	<br>
	<div class="employee-info container">
		<div class="data-display">ID:${bean.getId()} </div>
		<div class="data-display">Name:${bean.getName()}</div>
		<div class="data-display">Account Number:
			${bean.getAcno()}</div>
		<div class="data-display">Email Id: ${bean.getEmail()}</div>
		<div class="data-display">Age:${bean.getAge()}</div>
		<div class="data-display">Designation:${bean.getDesignation()}
		</div>
		<div class="data-display">Department Id:11
			</div>
		<div class="data-display">Manager Id:111</div>
		<div class="data-display">Phone:${bean.getPhone()}</div>
		<div class="data-display">Gender:${bean.getGender()}</div>
		<div class="data-display">Date of birth:${bean.getDob()}</div>
		<div class="data-display">Date of Joining:
			${bean.getJoiningDate()}</div>
		<div class="data-display">Salary: ${bean.getSalary()}</div>
	</div>
</body>
</html>