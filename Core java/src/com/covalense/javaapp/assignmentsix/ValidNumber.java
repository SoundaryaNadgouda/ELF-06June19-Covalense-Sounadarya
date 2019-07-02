package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

public class ValidNumber {
	private static final Logger log = Logger.getLogger("ValidNum");

	int s;

	void valid(int s) throws NotValidNum {
		this.s = s;
		if (s > 0) {
			log.info("valid Number");
		} else {
			throw new NotValidNum();
		}
	}

}
