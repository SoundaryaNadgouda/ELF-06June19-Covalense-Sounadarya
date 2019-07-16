package com.covalense.mywebapp.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmpInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;
@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		  ServletContext ctx=getServletContext(); String
		  movieName=ctx.getInitParameter("movie");
		  
		  ServletConfig config=getServletConfig(); String
		  actorName=config.getInitParameter("actor");
		 
		
		String idValue = req.getParameter("id");
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmpInfoBean bean=dao.getEmployeeInfo(idValue);
		
		PrintWriter out=resp.getWriter();
		
		if(bean==null) {
			out.print(	"<html>");
			out.print(	"<body>");	
			out.print(	"employee not found");		
			out.print("</body> ");
			out.print("</html> ");
		}else {
			out.print(	"<html>");
			out.print(	"<body>");	
			out.println("<br>"+ bean.getDesignation());
			out.println("<br>"+bean.getEmail());
			out.println("<br>"+bean.getGender());
			out.println("<br>"+bean.getName());
			out.println("<br>" + bean.getAcno());
			out.println("<br>" + bean.getAge());
			out.println("<br>"+ bean.getDeptid());
			out.println("<br>" + bean.getDob());
			out.println("<br>" + bean.getId());
			out.println("<br>" + bean.getJoiningDate());
			out.println("<br>" + bean.getManagerid());
			
			
			  out.println("<br> movie name :"+movieName);
			  out.println("<br> actor name :"+actorName);
			 
			out.println("<br>" + bean.getPhone());
			out.println("<br>" + bean.getSalary());
			out.print("</body> ");
			out.print("</html> ");
		}
	}
}
