package com.covalense.empspring.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="dept-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Entity
@Table(name="dept_info")


public class DepartmentInfoBean implements Serializable{
	@Id
	@Column(name="deptid")
	private int deptid;
	@Column(name="deptname")
	private String deptName;
	
	
}
