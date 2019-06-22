package com.covalense.javaapp.constructors;
import lombok.extern.java.Log;
@Log
public class Ac1 {
	Ac1(int n) {
	log.info(" "+n);
	}

	Ac1(double x) {
	log.info(" "+x);
	}

	Ac1(String s) {
		log.info(" "+s);
	}

	Ac1() {
		log.info("no parameter");
	}
}
