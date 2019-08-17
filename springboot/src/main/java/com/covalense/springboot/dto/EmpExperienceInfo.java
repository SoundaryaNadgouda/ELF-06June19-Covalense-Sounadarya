package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;



@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-experience-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name="emp_experience_info")
public class EmpExperienceInfo implements Serializable{
	
	@EmbeddedId
	private EmpExperiencePKBean experiencePKBean  ;
	private Integer yearOfExperience;
	private String designation;
	private String technology;
	public EmpExperiencePKBean getExperiencePKBean() {
		return experiencePKBean;
	}
	public void setExperiencePKBean(EmpExperiencePKBean experiencePKBean) {
		this.experiencePKBean = experiencePKBean;
	}
	public Integer getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(Integer yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	

}
