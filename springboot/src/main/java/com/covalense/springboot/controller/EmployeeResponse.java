package com.covalense.springboot.controller;
import java.util.List;

import com.covalense.springboot.dto.EmpInfoBean;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("employee-response")
public class EmployeeResponse {

	@JsonProperty("statusCode")
	private int statusCode;
	private String message;
	private String description;
	private  List<EmpInfoBean> beans;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<EmpInfoBean> getBeans() {
		return beans;
	}
	public void setBeans(List<EmpInfoBean> beans) {
		this.beans = beans;
	}
	
}



