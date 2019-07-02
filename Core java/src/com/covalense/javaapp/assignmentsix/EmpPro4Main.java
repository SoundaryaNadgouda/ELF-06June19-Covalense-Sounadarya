package com.covalense.javaapp.assignmentsix;

import java.util.ArrayList;
import java.util.logging.Logger;

public class EmpPro4Main {
	private static final Logger log = Logger.getLogger("EmpMain");

	public static void main(String[] args) {
		ArrayList<EmployeePro4> al = new ArrayList<EmployeePro4>();

		EmployeePro4 e1 = new EmployeePro4(101, "xyz", 20000);
		EmployeePro4 e2 = new EmployeePro4(201, "abc", 30000);
		EmployeePro4 e3 = new EmployeePro4(301, "mno", 50000);

		al.add(e1);
		al.add(e2);
		al.add(e3);

		for (EmployeePro4 e : al) {
			log.info("Id is " + e.getId());
			log.info("Name is " + e.getName());
			log.info("Sal is " + e.getSal());
			log.info("----------------------------------------------");
		}
	}

}
