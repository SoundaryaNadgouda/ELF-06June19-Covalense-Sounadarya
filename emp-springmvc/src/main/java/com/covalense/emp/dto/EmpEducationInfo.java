package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.covalense.emp.manytoone.EmpEducationPKBean;

import lombok.Data;

@Data
@Entity
@Table(name="emp_education_info")
public class EmpEducationInfo implements Serializable{

	@EmbeddedId
	private EmpEducationPKBean educationPKBean;
	private String branch;
	private Integer passout;
	private String institute;
	
}
