package com.covalense.javaapp.assignmentsix;

import java.io.Serializable;

public class StudentBean implements Serializable {

	private int id;
	private String name;

	public StudentBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
