package com.cov.javaapp.assignments;

import lombok.extern.java.Log;

@Log
public class Audi extends Parent {
	@Override
	void rcve() {
		log.info("drive audi");
	}
}
