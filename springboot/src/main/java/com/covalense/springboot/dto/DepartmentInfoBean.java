package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;


@SuppressWarnings("serial")
@JsonRootName(value="emp-info-bean")
//@XmlRootElement(name="dept-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name="dept_info")


public class DepartmentInfoBean implements Serializable{
	@Id
	@Column(name="deptid")
	private int deptid;
	@Column(name="deptname")
	private String deptName;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
