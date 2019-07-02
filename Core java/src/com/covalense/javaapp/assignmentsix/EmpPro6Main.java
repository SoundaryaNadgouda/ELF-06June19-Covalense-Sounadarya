package com.covalense.javaapp.assignmentsix;

import java.util.TreeSet;
import java.util.logging.Logger;

public class EmpPro6Main {
	private static final Logger log = Logger.getLogger("EmpPro6Test");

	public static void main(String[] args) {

		EmpById r = new EmpById();
		EmpBySal s = new EmpBySal();
		EmpByName n = new EmpByName();
		int key = 2;
		EmpPro6Test p = new EmpPro6Test();

		TreeSet<EmpPro6> t;
		switch (key) {
		case 1:
			t = new TreeSet<EmpPro6>(n);
			p.test(t);
			break;
		case 2:
			t = new TreeSet<EmpPro6>(r);
			p.test(t);

			break;
		case 3:
			t = new TreeSet<EmpPro6>(s);
			p.test(t);

			break;

		default:
			log.info("invalid number");
			break;
		}

	}

}
