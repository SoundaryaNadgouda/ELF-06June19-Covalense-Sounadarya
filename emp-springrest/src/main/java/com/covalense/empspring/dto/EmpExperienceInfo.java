package com.covalense.empspring.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="emp-experience-bean")
//@XmlAccessorType(XmlAccessType.FIELD)
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
