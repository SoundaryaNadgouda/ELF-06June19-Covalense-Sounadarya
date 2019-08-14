package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		//create a cookie
		Cookie myNameCookie=new Cookie("myName", "soundarya");
		
		Cookie myNameCookieOne=new Cookie("myCity", "Raichur");
		myNameCookie.setMaxAge(7*24*60*60);
		
		//send the above cookie to browser
		resp.addCookie(myNameCookie);
		resp.addCookie(myNameCookieOne);
		
		PrintWriter out=resp.getWriter();
		out.print("created the cookie !!! ");
		out.print("created another cookie !!! ");
		
	}
}
