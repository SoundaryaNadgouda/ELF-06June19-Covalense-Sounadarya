package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmpInfoBean;
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		EmpInfoBean infoBean=new EmpInfoBean();
		infoBean.setAge(23);
		infoBean.setId(19);
		infoBean.setGender("male");
		
		//pass the above object to EmployeeSeachServlet
		
		//req.setAttribute("info", infoBean);
		
		ServletContext servletContext=getServletContext();
		servletContext.setAttribute("info", infoBean);
		
		
		String url="search?id=2";
		//String url="https://www.google.com";
		RequestDispatcher dispatcher=req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
}
