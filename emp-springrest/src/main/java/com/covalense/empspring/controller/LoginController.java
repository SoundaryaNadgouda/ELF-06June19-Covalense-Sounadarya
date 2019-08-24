package com.covalense.empspring.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.covalense.empspring.dao.EmployeeDAO;
import com.covalense.empspring.dto.EmpInfoBean;
import lombok.extern.java.Log;

@Log
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	@Qualifier("hibernate")
	private EmployeeDAO dao;

	
	@PostMapping(value="/authentication",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login (int id,String password,HttpServletRequest req) {
		EmpInfoBean bean=dao.getEmployeeInfo1(id);
		EmployeeResponse employeeResponse=new EmployeeResponse();
		if(bean!=null && bean.getPassword().equals(password)) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setDescription("Login is successfull");
			employeeResponse.setBeans(Arrays.asList(bean));
			req.getSession().setAttribute("bean", bean);
		}else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Invalid credentials");
		}
		return employeeResponse;
	}
	
	@GetMapping(value = "/logout",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse employeeResponse=new EmployeeResponse();
		employeeResponse.setStatusCode(201);
		employeeResponse.setMessage("Successfull");
		employeeResponse.setDescription("Loged out successfully");
		return employeeResponse;
	}
	
	@GetMapping(value = "/readCookie",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name="JSESSIONID") String sessionId) {
		EmployeeResponse employeeResponse=new EmployeeResponse();
		employeeResponse.setStatusCode(201);
		employeeResponse.setMessage("Successfull");
		employeeResponse.setDescription("JSESSIONID : "+sessionId);
		return employeeResponse;
	}

	}
	

