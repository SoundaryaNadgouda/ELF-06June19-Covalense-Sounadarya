package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/form")
public class FormHandlingController {
	@GetMapping("/getForm")
	public String getForm() {
		return "myform";
	}

	@PostMapping("/formsubmit")
	public String submitForm(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("userid"));
		String pwd = req.getParameter("password");

		req.setAttribute("userid", id);
		req.setAttribute("password", pwd);
		return "formDataDisplay";
	}

	@PostMapping("/formsubmit2")
	public String submitForm2(int userid, String password, ModelMap modelMap) {
		modelMap.addAttribute("userid", userid);
		modelMap.addAttribute("password", password);
		return "formDataDisplay";
	}

	@PostMapping("/formsubmit3")
	public String submitForm3(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "formBeanDisplay";
	}
	

	@PostMapping("/formsubmit4")
	public String submitForm4(@RequestParam(name="userid") int soundarya,@RequestParam(name="password") String manoj,ModelMap modelMap) {
		modelMap.addAttribute("userid", soundarya);
		modelMap.addAttribute("password",manoj);
		return "formDataDisplay";
	}
	@PostMapping("/formsubmit5")
	public String submitForm5(@RequestParam(name="userid") int soundarya,@RequestParam(name="password") String manoj,ModelMap modelMap) {
		modelMap.addAttribute("userid", soundarya);
		modelMap.addAttribute("password",manoj);
		return "ExpressionLanguage";
	}
	@PostMapping("/formsubmit6")
	public String submitForm6(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "formBeanDisplayEL";
	}
}
