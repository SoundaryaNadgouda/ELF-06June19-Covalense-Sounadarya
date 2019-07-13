package com.covalense.javaapp.assignmentsix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class MobileMain {
	private static final Logger log = Logger.getLogger("EmpMain");

	public static void main(String[] args) {
		ArrayList<Mobile> al = new ArrayList<Mobile>();

		Mobile m1 = new Mobile("abc", 50000, 3.6);
		Mobile m2 = new Mobile("mno", 70000, 6.0);
		Mobile m3 = new Mobile("xyz", 30000, 7.0);

		al.add(m1);
		al.add(m2);
		al.add(m3);

		Collections.sort(al);

		for (Mobile m : al) {

			log.info(" Name is " + m.name);
			log.info(" Price is " + m.price);
			log.info(" Version is " + m.version);
			log.info("-------------------------------");

		}
	}
}
