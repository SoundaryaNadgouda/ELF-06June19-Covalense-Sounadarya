package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

public class StudentPro9 {

	private static final Logger log = Logger.getLogger("Student");

	String name;
	int age;
	double marks;

	void set(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;

	}

	void get() {
		log.info("" + name);
		log.info("" + age);
		log.info("" + marks);
		log.info("-------------------------------------------");
	}

}
