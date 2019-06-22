package com.covalense.javaapp.eccapsulation;

import lombok.extern.java.Log;

@Log
public class Emp1 {
	void store(Details d) {
		log.info("salary of emp1 is " + d.getSal());
		log.info("name  of emp1 is " + d.getName());
		log.info("gender of emp1 is " + d.getGender());

	}
}
