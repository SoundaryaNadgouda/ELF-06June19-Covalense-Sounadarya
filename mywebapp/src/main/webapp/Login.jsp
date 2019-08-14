<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Show Password</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
   <style>
            .form-size {
                height: 200px;
                width: 400px;
            }
            .margin-for-element {
                margin-top: 200px;
                margin-left: 600px;
            }
            .margin-bottom-input {
                margin-bottom: 40px;
            }
            #pwd:focus {
             outline: none;
            }
        </style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container margin-for-element">
<p id="success" style="visibility: hidden; color:green">Logged out successfully</p>
<br><br>
<h2>Login Page</h2>
<br><br>

<%=request.getParameter("error") %>
<%= %>
    <form class="form-size" action="http://localhost/empapp/login" method="post">
        <input type="number" class="form-control margin-bottom-input" placeholder="Enter id" name="id"/>
        <div class="form-control">
            <input type="password" id="pwd"  name="password" style="border: none !important;width:340px;" placeholder="Enter password"/>
            <span class="glyphicon glyphicon-eye-open" onclick="showPassword()"></span>
        </div>
        <br>
        <input type="submit" class="btn btn-primary" value="Login"/>
<!--             <button type="button" class="btn btn-primary">Submit</button> -->
        <br><br>
        <div class="row">
            <button class="col-6 btn btn-primary"><a href="http://localhost/empapp/createemployee.html" style="color: white !important">Create Account</a></button>
            <button  class="col-6 btn btn-primary">Forgot Password</button>
        </div>
    </form>
    <br>
    <p id="err" style="visibility: hidden; color:red">Invalid Credentials</p>
</div>
<script src = "login.js"></script>

</body>
</html>