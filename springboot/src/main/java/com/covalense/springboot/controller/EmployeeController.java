package com.covalense.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmpAddressInfo;
import com.covalense.springboot.dto.EmpEducationInfo;
import com.covalense.springboot.dto.EmpExperienceInfo;
import com.covalense.springboot.dto.EmpInfoBean;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;

	@GetMapping(path="/hello",produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World !!!";
	}
	
	@PostMapping(path="/create",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmpInfoBean bean) {
		
		bean.getEmpOtherInfoBean().setInfoBean(bean);
		
		for (EmpAddressInfo addressInfo : bean.getAdressInfoBean()) {
			addressInfo.getPkBean().setInfoBean(bean);
		}
		
		for (EmpEducationInfo educationInfo : bean.getEducationInfoBean()) {
			educationInfo.getEducationPKBean().setInfoBean(bean);
		}
		
		for (EmpExperienceInfo experienceInfo : bean.getExperienceInfoBean()) {
			experienceInfo.getExperiencePKBean().setInfoBean(bean);
		}
		
		EmpInfoBean manager=bean.getMngId();
		manager=repository.findById(manager.getId()).get();
		bean.setMngId(manager);
		
		EmployeeResponse response=new EmployeeResponse();
		
		if(!repository.existsById(bean.getId())) {
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee data added successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data not added");
		}
	return response;
		
	}
	
	@PutMapping(path="/update",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmpInfoBean bean) {
		
		bean.getEmpOtherInfoBean().setInfoBean(bean);
		
		for (EmpAddressInfo addressInfo : bean.getAdressInfoBean()) {
			addressInfo.getPkBean().setInfoBean(bean);
		}
		
		for (EmpEducationInfo educationInfo : bean.getEducationInfoBean()) {
			educationInfo.getEducationPKBean().setInfoBean(bean);
		}
		
		for (EmpExperienceInfo experienceInfo : bean.getExperienceInfoBean()) {
			experienceInfo.getExperiencePKBean().setInfoBean(bean);
		}
		
		EmpInfoBean manager=bean.getMngId();
		manager=repository.findById(manager.getId()).get();
		bean.setMngId(manager);
		
		EmployeeResponse response=new EmployeeResponse();
		
		if(repository.existsById(bean.getId())) {
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee data updated successfully");
			
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data not updated");
		}
	return response;
		
	}
	
	@GetMapping(path="/getEmployee",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		
		EmployeeResponse response=new EmployeeResponse();
		if(repository.existsById(id)) {
			EmpInfoBean bean=repository.findById(id).get();
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee data found successfully");
			response.setBeans(Arrays.asList(bean));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data not found");
		}
		return response;
	}
	
	@DeleteMapping(path="/deletetEmployee",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestParam("id") int id) {
		EmpInfoBean bean=repository.findById(id).get();
		EmployeeResponse response=new EmployeeResponse();
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee data deleted successfully");
			response.setBeans(Arrays.asList(bean));
			repository.delete(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data is not deleted");
		}
		return response;
	}
}
