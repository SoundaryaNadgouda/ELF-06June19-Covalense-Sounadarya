package com.covalense.javaapp.encapsulation;

import lombok.extern.java.Log;

@Log
public class EmpTwo {
	void store(Details d) {
		log.info("salary of emp2 is " + d.getSal());
		log.info("name  of emp2 is " + d.getName());
		log.info("gender of emp2  is " + d.getGender());

	}
}
