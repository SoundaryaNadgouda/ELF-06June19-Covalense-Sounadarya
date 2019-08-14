<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!
    public String name="Soundarya";
    private int age=23;
    {
    	System.out.println("Inside Block");
    }
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    public String getName(String name){
    	return "name is :"+name;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Tags</title>
</head>
<body>
<h1>Jsp Tags</h1>
<br><br>
			Name1:<%=name %><br>
			Name2:<%=getName() %><br>
			Name3:<%=getName("Shivani") %><br>
			Age1:<%=age %><br>
			Age2:<%=getAge() %><br>
			
			<br><br>
			<% 
			for(int i=1;i<5;i++){
				%>
					Name1:<%=name %><br>
		<% 
			}
		%>			
		
		
				
</body>
</html>