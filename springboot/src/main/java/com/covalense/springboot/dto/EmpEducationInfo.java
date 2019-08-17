package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;



@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-education-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name="emp_education_info")
public class EmpEducationInfo implements Serializable{

	@EmbeddedId
	private EmpEducationPKBean educationPKBean;
	private String branch;
	private Integer passout;
	private String institute;
	public EmpEducationPKBean getEducationPKBean() {
		return educationPKBean;
	}
	public void setEducationPKBean(EmpEducationPKBean educationPKBean) {
		this.educationPKBean = educationPKBean;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Integer getPassout() {
		return passout;
	}
	public void setPassout(Integer passout) {
		this.passout = passout;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	
	
}
