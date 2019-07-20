package com.covalense.empapp.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.empapp.beans.EmpInfoBean;
import com.covalense.empapp.dao.EmployeeDAO;
import com.covalense.empapp.dao.EmployeeDAOFactory;


@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		//validate the session
		HttpSession session=req.getSession(false);
		if(session==null) {
			//invalid session;login with error message
			out.print("<h1><span style='color:red'>Invalid session!! pls provide valid credentials");
			out.print("<br><br>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		ArrayList<EmpInfoBean>bean  =dao.searchEmployeeId(Integer.parseInt(req.getParameter("id")));
		
		
		for (EmpInfoBean empBean : bean) {
			
			/* out.print("<a href='\display?id="+'"+empBean.getId()+'+">"); */
		
			out.print(	"<html>");
			out.print(	"<body>");	
			out.print("<div class=\"data-display\">ID: "+empBean.getId()+ "</div>");
			out.print("<div class=\"data-display\">Name: "+empBean.getName()+" </div>           ");
			out.print("<div class=\"data-display\">Account Number: "+empBean.getAcno()+ "</div> ");
			out.print("<div class=\"data-display\">Email Id: "+empBean.getEmail()+" </div>       ");
			out.print("<div class=\"data-display\">Age: "+empBean.getAge()+" </div>            ");
			out.print("<div class=\"data-display\">Designation: "+empBean.getDesignation()+" </div>    ");
			out.print("<div class=\"data-display\">Department Id: "+empBean.getDeptid()+" </div>  ");
			out.print("<div class=\"data-display\">Manager Id: "+empBean.getManagerid()+"</div>     ");
			out.print("<div class=\"data-display\">Phone: "+empBean.getPhone()+"</div>          ");
			out.print("<div class=\"data-display\">Gender: "+empBean.getGender()+" </div>         ");
			out.print("<div class=\"data-display\">Date of birth: "+empBean.getDob()+" </div>  ");
			out.print("<div class=\"data-display\">Date of Joining: "+empBean.getJoiningDate()+" </div>");
			out.print("<div class=\"data-display\">Salary: "+empBean.getSalary()+" </div>   ");
			out.print("</div> ");
			out.print("</body>");
			out.print("</html>");	
		
			}
		}
}		
		