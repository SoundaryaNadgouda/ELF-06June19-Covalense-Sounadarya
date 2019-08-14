package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dao.GetName;



@Controller
@RequestMapping("/login1")
public class NameController {
	
	@GetMapping("/loginPage")
	public String getForm() {
		return "Login";
	}
@PostMapping("/getName")
	public String getName(HttpServletRequest req) {
	GetName getName=new GetName();
	String name=getName.getName();
	req.setAttribute("msg", name);
		return "name";
	}

}
