package com.covalense.empapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.empapp.beans.EmpInfoBean;
import com.covalense.empapp.dao.EmployeeDAO;
import com.covalense.empapp.dao.EmployeeDAOFactory;



@WebServlet("/create")
public class CreateEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmpInfoBean bean = new EmpInfoBean();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		try {
			date = format.parse("2013-02-01");
		} catch (ParseException e) {

			e.printStackTrace();
		}

		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName((req.getParameter("name")));
		bean.setAcno(Long.parseLong(req.getParameter("acno")));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setDeptid(Integer.parseInt(req.getParameter("deptid")));
		bean.setDesignation(req.getParameter("designation"));
		bean.setDob(date);
		bean.setEmail(req.getParameter("email"));
		bean.setGender(req.getParameter("gender"));
		bean.setJoiningDate(date);
		bean.setManagerid(Integer.parseInt(req.getParameter("managerid")));
		bean.setPhone(Long.parseLong(req.getParameter("phoneno")));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setPassword(req.getParameter("password"));

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		PrintWriter out = resp.getWriter();

		if (dao.createEmpInfo(bean)) {
			out.print("<html>");
			out.print("<body>");
			out.print("employee created");
			out.print("</body> ");
			out.print("</html> ");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("employee is present");
			out.print("</body> ");
			out.print("</html> ");
		}
	}
}
