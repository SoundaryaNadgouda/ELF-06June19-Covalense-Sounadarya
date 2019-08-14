package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.covalense.emp.manytoone.EmpEducationPKBean;
import com.covalense.emp.manytoone.EmpExperiencePKBean;

import lombok.Data;

@Data
@Entity
@Table(name="emp_experience_info")
public class EmpExperienceInfo implements Serializable{
	
	@EmbeddedId
	private EmpExperiencePKBean experiencePKBean  ;
	private Integer yearOfExperience;
	private String designation;
	private String technology;

}
