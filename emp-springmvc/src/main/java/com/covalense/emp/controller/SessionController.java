package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/session")
public class SessionController {
	
	@GetMapping("/login")
	public String login() {
		return "LoginPage";
	
	}
	@PostMapping("/login")
	public String authenticate(UserBean userBean,HttpSession session,  HttpServletRequest req) {
		req.setAttribute("msg", "invalid credentials");
		return "Loginpage";
	}
	

}
