
package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;

@Log
@WebServlet("/soundarya")
public  class MyFirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		  ServletContext ctx=getServletContext(); String
		  movieName=ctx.getInitParameter("movie");
		  
		  ServletConfig config=getServletConfig(); String
		  actorName=config.getInitParameter("actor");
		 
		/*
		 * String httpMethod=req.getMethod(); String protocol=req.getProtocol(); String
		 * requestUrl=req.getRequestURI().toString();
		 * 
		 * log.info("Http method==>"+httpMethod); log.info("Protocol====>"+protocol);
		 * log.info("Url ====>"+requestUrl);
		 * 
		 */
		String currentDateTime =new Date().toString();
		
		//Get query string information
		String fnameValue=req.getParameter("fname");
		String lnameValue=req.getParameter("lname");
		
		String htmlResponse="<!DOCTYPE html>"+
		"<html>"+
		"<head>"+
		"<meta charset=\"ISO-8859-1\">"+
		"<title>My First HTML</title>"+
		"</head>"+
		"<body>"+
		"<h1>"+
			" Current Date & Time is : "+
			" <br>  "+
			" <span style=\"color: red\"> Current Date & Time</span> "+currentDateTime+
			"<br><br>"+
			"first name : "+fnameValue+
			"<br><br>"+
			"lname  : "+lnameValue+
				
				  "<br><br>"+ "movie name : "+movieName+ "<br><br>"+
				  "actor name  : "+actorName+
				 
			" </h1> "+
		"</body> "+
		"</html> ";
		
		//send the above code html response to browser
		resp.setContentType("text/html");
//		resp.setHeader("Refresh", "1");		//auto refresh
		PrintWriter out=resp.getWriter();
		out.print(htmlResponse);
	}

}
