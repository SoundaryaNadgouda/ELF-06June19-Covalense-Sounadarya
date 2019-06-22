package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;
@Log
public class Animal {
	void sound() {
		log.info("animal sound");
	}

	void div(int a, int b) {
		int c = a / b;
		log.info(" "+c);
	}
}
