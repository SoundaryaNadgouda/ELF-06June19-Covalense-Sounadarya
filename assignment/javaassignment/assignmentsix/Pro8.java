package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

public class Pro8 {

	private static final Logger log = Logger.getLogger("Pro8");

	public static void main(String[] args) {
		ValidAge v = new ValidAge();
		try {
			v.valid(18);
		} catch (NotValidAge e) {

			log.info(" " + e);
		}
	}
}
