package com.covalense.empapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.empapp.beans.EmpInfoBean;
import com.covalense.empapp.dao.EmployeeDAO;
import com.covalense.empapp.dao.EmployeeDAOFactory;
@WebServlet("/firstpage")
public class FirstLoginPageServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie dummyCookie=new Cookie("dummyCookie", "CheckCookiesEnabled");
	resp.addCookie(dummyCookie);
	PrintWriter out=resp.getWriter();
	//validate the session
	HttpSession session=req.getSession(false);
	if(session==null) {
		//invalid session;login with error message
		out.print("<h1><span style='color:red'>Invalid session!! pls provide valid credentials");
		out.print("<br><br>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
		dispatcher.include(req, resp);
	}else {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/login");
		dispatcher.forward(req, resp);
		
		
	}
	
}
}
