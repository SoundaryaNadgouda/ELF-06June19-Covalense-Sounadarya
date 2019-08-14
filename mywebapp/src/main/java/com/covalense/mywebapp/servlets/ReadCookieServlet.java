package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		Cookie[] receivedCookies=req.getCookies();
		PrintWriter out=resp.getWriter();
		if(receivedCookies==null) {
			out.println ("cookies are not present !!!");
		}else {
			out.println("cookies are present !!!");
			for(Cookie rcvdCookie:receivedCookies) {
				out.println("Cookie name: "+rcvdCookie.getName());
				out.print("Cookie value: "+rcvdCookie.getValue());
			}
		}
		
	}
}
