package com.covalense.javaapp.assignmentsix;

import java.util.Comparator;

public class EmpBySal implements Comparator<EmpPro6> {

	@Override
	public int compare(EmpPro6 o1, EmpPro6 o2) {
		if (o1.sal > o2.sal) {
			return 1;
		} else if (o1.sal < o2.sal) {
			return -1;
		} else {
			return 0;
		}
	}
}
