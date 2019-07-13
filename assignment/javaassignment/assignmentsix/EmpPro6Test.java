package com.covalense.javaapp.assignmentsix;

import java.util.TreeSet;
import java.util.logging.Logger;

public class EmpPro6Test {
	private static final Logger log = Logger.getLogger("EmpPro6Test");

	void test(TreeSet<EmpPro6> t) {

		EmpPro6 e1 = new EmpPro6();
		e1.name = "soundarya";
		e1.id = 2;
		e1.sal = 20000;

		EmpPro6 e2 = new EmpPro6();
		e2.name = "anjali";
		e2.id = 4;
		e2.sal = 30000;

		EmpPro6 e3 = new EmpPro6();
		e3.name = "sahana";
		e3.id = 3;
		e3.sal = 15000;

		EmpPro6 e4 = new EmpPro6();
		e4.name = "rashmi";
		e4.id = 1;
		e4.sal = 50000;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		for (EmpPro6 e : t) {
			log.info("name=" + e.name + " id=" + e.id + " salary=" + e.sal);
		}

	}

}
