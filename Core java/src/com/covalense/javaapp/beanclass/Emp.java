package com.covalense.javaapp.beanclass;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
	private int id;
	private String name;

	public Emp() {
		super();
	}

	private String dept;

	private double sal;
	private int age;
	private Date joiningdate;
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", age=" + age
				+ ", joiningdate=" + joiningdate + ", gender=" + gender + "]";
	}

	public Emp(int id, String name, String dept, double sal, int age, Date joiningdate, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.age = age;
		this.joiningdate = joiningdate;
		this.gender = gender;
	}

}
