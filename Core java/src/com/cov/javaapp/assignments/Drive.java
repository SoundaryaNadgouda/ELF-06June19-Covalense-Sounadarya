package com.cov.javaapp.assignments;

import lombok.extern.java.Log;

@Log
public class Drive {
	void take(Parent p) {
		if (p instanceof Benz) {
			log.info("drive benz");
		} else if (p instanceof Audi) {
			log.info("drive audi");
		}
	}
}
