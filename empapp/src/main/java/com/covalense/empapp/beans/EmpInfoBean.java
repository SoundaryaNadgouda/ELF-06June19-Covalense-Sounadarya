package com.covalense.empapp.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name="empinfo")
@Data
public class EmpInfoBean implements Serializable {
@Id
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
	private String password;

}
