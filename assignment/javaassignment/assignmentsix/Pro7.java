package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

public class Pro7 {

	private static final Logger log = Logger.getLogger("Pro7");

	public static void main(String[] args) {
		ValidNumber v = new ValidNumber();
		try {
			v.valid(0);
		} catch (NotValidNum e) {

			log.info(" " + e);
		}
	}

}
