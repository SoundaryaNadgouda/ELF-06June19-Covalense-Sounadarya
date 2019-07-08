package com.covalense.designpattern.builder;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class EmployeeData  {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private long acno;
	private String email;
	private String designation;
	private Date dob;
	private int deptid;
	private int managerid;

}
