package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

public class EmployeePro10 {
	private static final Logger log = Logger.getLogger("Employee");
	String name;
	int age;
	String designation;
	double sal;

	void set(String name, int age, String designation, double sal) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.sal = sal;

	}

	void get() {
		log.info(name);
		log.info(" " + age);
		log.info(designation);
		log.info(" " + sal);
		log.info("--------------------------------------------------");
	}

}
