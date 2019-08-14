package com.covalense.empspring.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.covalense.empspring.dao.EmployeeDAO;
import com.covalense.empspring.dto.EmpAddressInfo;
import com.covalense.empspring.dto.EmpEducationInfo;
import com.covalense.empspring.dto.EmpExperienceInfo;
import com.covalense.empspring.dto.EmpInfoBean;
import com.covalense.empspring.dto.EmpOtherInfoBean;

@RestController
@RequestMapping("/emprest")
public class SpringRestController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@DeleteMapping(value = "/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestParam("id") int id, HttpServletRequest req) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (req.getSession(false) != null) {
			if (dao.deleteEmpInfo(id)) {
				employeeResponse.setStatusCode(201);
				employeeResponse.setMessage("Successfull");
				employeeResponse.setDescription("Employee data deleted successfully");
			} else {
				employeeResponse.setStatusCode(401);
				employeeResponse.setMessage("Failure");
				employeeResponse.setDescription("Employee data is not deleted");
			}
			return employeeResponse;
		} else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please login first");
			return employeeResponse;
		}
	}

	@PostMapping(value = "/createEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmpInfoBean bean) {
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

		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (dao.createEmpInfo(bean)) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setDescription("Employee data inserted successfully");
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Employee data is not inserted");
		}
		return employeeResponse;
	}

	@PutMapping(value = "/updateEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmpInfoBean bean, HttpServletRequest req) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (req.getSession(false) != null) {
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
			if (dao.updateEmpInfo1(bean)) {
				employeeResponse.setStatusCode(201);
				employeeResponse.setMessage("Successfull");
				employeeResponse.setDescription("Employee data is updated successfully");
			} else {
				employeeResponse.setStatusCode(401);
				employeeResponse.setMessage("Failure");
				employeeResponse.setDescription("Employee data is not updated");
			}
			return employeeResponse;
		} else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please login first");
			return employeeResponse;
		}
	}

	@GetMapping(value = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id, HttpServletRequest req) {

		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (req.getSession(false) != null) {
			EmpInfoBean empInfoBean = dao.getEmployeeInfo1(id);
			if (empInfoBean != null) {
				employeeResponse.setStatusCode(201);
				employeeResponse.setMessage("Successfull");
				employeeResponse.setDescription("Employee data found successfully");
				employeeResponse.setBeans(Arrays.asList(empInfoBean));
			} else {
				employeeResponse.setStatusCode(401);
				employeeResponse.setMessage("Failure");
				employeeResponse.setDescription("Employee data not found");
			}
			return employeeResponse;
		} else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please login first");
			return employeeResponse;
		}
		// return dao.getEmployeeInfo1(id);
	}

	@GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(HttpServletRequest req) {

		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (req.getSession(false) != null) {
			List<EmpInfoBean> empInfoBeans = dao.getAllEmployeeInfo();
			if (empInfoBeans != null) {
				employeeResponse.setStatusCode(201);
				employeeResponse.setMessage("Successfull");
				employeeResponse.setDescription("Employee data found successfully");
				employeeResponse.setBeans(empInfoBeans);
			} else {
				employeeResponse.setStatusCode(401);
				employeeResponse.setMessage("Failure");
				employeeResponse.setDescription("Employee data not found");
			}
			return employeeResponse;
		} else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please login first");
			return employeeResponse;
		}

		// return dao.getAllEmployeeInfo();
	}

}
