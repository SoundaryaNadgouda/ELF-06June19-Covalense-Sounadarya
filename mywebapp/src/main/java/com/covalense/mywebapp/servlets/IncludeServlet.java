package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/include")
public class IncludeServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		RequestDispatcher dispatcher=null;
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("11111111111");
		out.println("<br>");
		
		dispatcher=req.getRequestDispatcher("index.html");
		dispatcher.include(req, resp);
		out.println("<br>");
		
		out.println("2222222222");
		out.println("<br>");
		
		dispatcher=req.getRequestDispatcher("soundarya?fname=soujanya&lname=mn");
		dispatcher.include(req, resp);
		out.println("<br>");
		
		out.println("3333333333");
		out.println("<br>");
		
		dispatcher=req.getRequestDispatcher("search?id=2");
		dispatcher.include(req, resp);
		out.println("<br>");
		
		out.println("444444444");

	}
}
