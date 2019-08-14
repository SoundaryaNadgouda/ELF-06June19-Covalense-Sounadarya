package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/employee1")
public class EmpController {

	@RequestMapping(path="getMessage",method=RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("message");
		return modelAndView;
	}
	@GetMapping("/seeMessage")
	public ModelAndView getMessage(ModelAndView modelAndView) {
		modelAndView.setViewName("message");
		return modelAndView;
	}
}
