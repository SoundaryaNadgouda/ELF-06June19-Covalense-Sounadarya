package com.covalense.emp.controller;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static com.covalense.emp.common.CommonFiles.PROP_FILE;
import static com.covalense.emp.common.CommonFiles.LOGIN_PAGE;
import static com.covalense.emp.common.CommonFiles.HOME_PAGE;
import static com.covalense.emp.common.CommonFiles.SEARCH_PAGE;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
import com.covalense.emp.dto.EmpInfoBean;


import lombok.extern.java.Log;
@Log
@Controller
@RequestMapping("/login")
@PropertySource(PROP_FILE)
public class LoginController {
	
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@GetMapping("/loginPage")
	public String getMessage() {
	
		return LOGIN_PAGE;
		
	}

	@PostMapping("/authenticate")
	public String submitForm2(int id, String password, HttpServletRequest req) {
		//EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInteractionType);
		EmpInfoBean bean = dao.getEmployeeInfo1(id);

		if (bean != null&&bean.getPassword().equals(password)) {
			HttpSession session=req.getSession(true);
		
			session.setAttribute("bean", bean);
			
			return HOME_PAGE;
		} else {
	req.setAttribute("msg", "enter all the data");
		return LOGIN_PAGE;
	}
	}	

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap,@Value("${msg1}") String msg1) {
		session.invalidate();
		modelMap.addAttribute("msg", msg1);
		return LOGIN_PAGE;
	}

}
