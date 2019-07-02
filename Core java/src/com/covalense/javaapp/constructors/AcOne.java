package com.covalense.javaapp.constructors;
import lombok.extern.java.Log;
@Log
public class AcOne {
	AcOne(int n) {
	log.info(" "+n);
	}

	AcOne(double x) {
	log.info(" "+x);
	}

	AcOne(String s) {
		log.info(" "+s);
	}

	AcOne() {
		log.info("no parameter");
	}
}
