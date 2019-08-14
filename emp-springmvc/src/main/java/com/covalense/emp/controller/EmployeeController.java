package com.covalense.emp.controller;

import static com.covalense.emp.common.CommonFiles.LOGIN_PAGE;
import static com.covalense.emp.common.CommonFiles.SEARCH_PAGE;
import static com.covalense.emp.common.CommonFiles.CREATE_PAGE;
import static com.covalense.emp.common.CommonFiles.HOME_PAGE;
import static com.covalense.emp.common.CommonFiles.UPDATE_PAGE;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.help.HomeAction;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dto.EmpAddressInfo;
import com.covalense.emp.dto.EmpEducationInfo;
import com.covalense.emp.dto.EmpExperienceInfo;
import com.covalense.emp.dto.EmpInfoBean;
import com.covalense.emp.dto.EmpOtherInfoBean;

import lombok.extern.java.Log;

import com.covalense.emp.dto.EmpInfoBean;
@Log
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@GetMapping("/search")
	public String employeeSeach(HttpServletRequest response, @RequestParam int id) {
		ArrayList<EmpInfoBean> bean = dao.searchEmployeeId(id);
		response.setAttribute("bean", bean);
		return SEARCH_PAGE;
	}

	@PostMapping("/employeeSubmit")
	public String employeeSave(EmpInfoBean bean, ModelMap modelMap) {

		List<EmpEducationInfo> eduInfobean = bean.getEducationInfoBean();
		for (EmpEducationInfo educationInfoBean : eduInfobean) {
			educationInfoBean.getEducationPKBean().setInfoBean(bean);
		}

		List<EmpAddressInfo> addressInfobean = bean.getAdressInfoBean();
		for (EmpAddressInfo employeeAddresInfoBean : addressInfobean) {
			employeeAddresInfoBean.getPkBean().setInfoBean(bean);
		}

		List<EmpExperienceInfo> empExperienceInfo = bean.getExperienceInfoBean();
		for (EmpExperienceInfo experienceInfo : empExperienceInfo) {
			experienceInfo.getExperiencePKBean().setInfoBean(bean);
		}

		EmpOtherInfoBean empOtherInfoBean = bean.getEmpOtherInfoBean();
		empOtherInfoBean.setInfoBean(bean);

		modelMap.addAttribute("msg", "Employee");

		log.info("emp form");

		modelMap.addAttribute("EmployeeInfoBean", bean.toString());

		boolean isInserted = dao.createEmpInfo(bean);
		if (isInserted) {
			modelMap.addAttribute("msg", "Employee Created successfully");
		} else {
			modelMap.addAttribute("msg", "Employee creation faileds");
		}
		return LOGIN_PAGE;
	}

	@GetMapping("/create")
	public String create() {
		return CREATE_PAGE;
	}
	
	@GetMapping("/updateEmployee")
	public String getUpdateEmployee() {
		return UPDATE_PAGE;
	}

	@PostMapping("/updateEmployee")
	public String getUpdateEmployee(EmpInfoBean infoBean,int managerid) {
		EmpInfoBean mngBean=dao.getEmployeeInfo1(managerid);
		infoBean.setMngId(mngBean);
		dao.updateEmpInfo(infoBean);
		return HOME_PAGE;
	}
	
}
