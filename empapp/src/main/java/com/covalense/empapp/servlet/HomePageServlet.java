package com.covalense.empapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.empapp.beans.EmpInfoBean;
import com.covalense.empapp.dao.EmployeeDAO;
import com.covalense.empapp.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;
@WebServlet("/homeservlet")
@Log
public class HomePageServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter out = resp.getWriter();
	EmployeeDAO dao = EmployeeDAOFactory.getInstance();
	EmpInfoBean bean = dao.getEmployeeInfo(Integer.parseInt(req.getParameter("id")));
	out.print("<html>");
	out.print("<head>");
	out.print("<meta charset='UTF-8'>");
	out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
	out.print("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
	out.print("<title>Employee Management Portal</title>");
	out.print(
			"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
	out.print("<style>                     ");
	out.print(".nav {                      ");
	out.print("background-color: beige;    ");
	out.print("}                           ");
	out.print(".profile {                  ");
	out.print("height:50px;                ");
	out.print("width:20px;                 ");
	out.print("background-color: blueviolet");
	out.print("}                           ");
	out.print(".logout {                   ");
	out.print("font-size: 25px;            ");
	out.print("color: brown;               ");
	out.print("font-weight: 600;           ");
	out.print("                            ");
	out.print("}                           ");
	out.print(".employee-info {            ");
	out.print("border: 1px solid brown;    ");
	out.print("}                           ");
	out.print(".data-display {             ");
	out.print("font-size: 18px;            ");
	out.print("padding: 5px;               ");
	out.print("}                           ");
	out.print("</style>                    ");
	out.print("</head>                     ");
	out.print("<body>                      ");
	out.print("<div style=\"background-color: beige;\"> ");
	out.print("<h1 style=\"margin-left:35%\">Employee Management Portal</h1>                        ");
	out.print("<div class=\"row\" style=\"height:70px; padding: 20px;\">                              ");
	out.print("<div class=\"col-1 profile\"><span ></span></div>                                    ");
	out.print("<div class=\"col-5\"><span class=\"logout\">Edit</span></div>                          ");
	out.print(
			"<div class=\"search col-3\"><form action=\"./search\"  method=\"get\"><input type=\"text\" name=\"id\" placeholder=\"Search\"/><button type=\"submit\" class=\"btn btn-success\">Search</button></form></div>          ");
//out.print("<a href=\"http://localhost\empapp\search\> <button>search</button>");
//out.print("<a href="http:>"

	out.print(
			"<div class=\"col-3\"><a href=\"./logout\"><span class=\"logout\" style=\"margin-left: 70%;\">Logout</span></a></div> ");
	out.print("</div>     ");
	out.print("</div>     ");
	out.print("<br><br>   ");
	out.print("<div class=\"EmpInfoBean container\">            ");
	out.print("<div class=\"data-display\">ID: " + bean.getId() + "</div>");
	out.print("<div class=\"data-display\">Name: " + bean.getName() + " </div>           ");
	out.print("<div class=\"data-display\">Account Number: " + bean.getAcno() + "</div> ");
	out.print("<div class=\"data-display\">Email Id: " + bean.getEmail() + " </div>       ");
	out.print("<div class=\"data-display\">Age: " + bean.getAge() + " </div>            ");
	out.print("<div class=\"data-display\">Designation: " + bean.getDesignation() + " </div>    ");
	out.print("<div class=\"data-display\">Department Id: " + bean.getDeptid() + " </div>  ");
	out.print("<div class=\"data-display\">Manager Id: " + bean.getManagerid() + "</div>     ");
	out.print("<div class=\"data-display\">Phone: " + bean.getPhone() + "</div>          ");
	out.print("<div class=\"data-display\">Gender: " + bean.getGender() + " </div>         ");
	out.print("<div class=\"data-display\">Date of birth: " + bean.getDob() + " </div>  ");
	out.print("<div class=\"data-display\">Date of Joining: " + bean.getJoiningDate() + " </div>");
	out.print("<div class=\"data-display\">Salary: " + bean.getSalary() + " </div>   ");
	out.print("</div> ");
	out.print("</body>");
	out.print("</html>");
	}
}
