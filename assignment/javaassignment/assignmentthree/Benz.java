package com.covalense.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log
public class Benz extends Parent {
	@Override
	void rcve() {
		log.info("drive benz");
	}
}