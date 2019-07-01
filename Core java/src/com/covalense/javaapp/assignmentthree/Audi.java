package com.covalense.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log
public class Audi extends Parent {
	@Override
	void rcve() {
		log.info("drive audi");
	}
}
