package com.covalense.javaapp.constructors;
import lombok.extern.java.Log;
@Log
public class St {
	String n;
	int a;
	double p;

	St() {

	}

	void dis() {
		log.info("name is " + n);
		log.info("age is " + a);
	log.info("percentage is " + p);

	}
}
