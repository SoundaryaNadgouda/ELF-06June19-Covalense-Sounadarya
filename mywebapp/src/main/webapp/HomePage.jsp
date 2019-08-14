<%@page import="com.covalense.mywebapp.beans.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset='UTF-8'>
<meta name= "viewport" content= "width=device-width,
	initial-scale=1.0">
<meta http-equiv= "X-UA-Compatible" content= "ie=edge">
<title>Employee Management Portal</title>
<link rel= "stylesheet" href=
	"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity=
	"sha384-ggOyR0iXCbMQv3Xipma34MDdH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
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
<%= %>
	<div style="" "background-color:beige;">
		<h1 style="""margin-left:35%">Employee Management Portal</h1>
		<div class= "row" style="""height:70px; padding: 20px;">
			<div class= "col-1profile">
				<span></span>
			</div>
			<div class="col-5">
				<span class="logout">Edit</span>
			</div>
			<div class= "searchcol-3">
				<form action= "./search"  method="get">
					<input type= "text" name= "id" placeholder= "Search"/>
					<button type= "submit" class= "btnbtn-success">Search</button>
				</form>
			</div>
			
				<button>search</button>");
				<div class="col-3">
					<a href="./logout"><span class= "logout" style="""margin-left: 70%;">Logout</span></a>
				</div>
		</div>
	</div>
	<br>
	<br>
	<% EmpInfoBean bean=(EmpInfoBean) session.getAttribute("data");
	%>
<%-- 	<%	EmployeeInfoBean bean=(EmployeeInfoBean) session.getAttribute("data"); %> --%>
	<div class= "EmpInfoBeancontainer">
		<div class="data-display">ID:  <%= bean.getId()%>  </div>
		<div class="data-display">Name:  <%=bean.getName()%>  </div>
		<div class="data-display">Account Number: " <%=bean.getAcno()%> 
			"</div>
		<div class="data-display">Email Id:  <%=bean.getEmail()%>   </div>
		<div class="data-display">Age:  <%=bean.getAge()%> </div>
		<div class="data-display">Designation:  
			<%= bean.getDesignation() %> </div>
		<div class="data-display">Department Id:  <%= bean.getDeptid() %>
			 </div>
		<div class="data-display">Manager Id:   <%=bean.getManagerid() %>
			 </div>
		<div class="data-display">Phone:<%=   bean.getPhone()%> </div>
		<div class="data-display">Gender: <%=   bean.getGender()  %></div>
		<div class="data-display">Date of birth: <%=  bean.getDob()  %>
		</div>
		<div class="data-display">Date of Joining: <%=  
			bean.getJoiningDate()  %></div>
		<div class="data-display">Salary:<%=   bean.getSalary()  %></div>
	</div>
	
</body>
</html>
