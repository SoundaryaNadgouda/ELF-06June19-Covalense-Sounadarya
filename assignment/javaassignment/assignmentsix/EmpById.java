package com.covalense.javaapp.assignmentsix;

import java.util.Comparator;

public class EmpById implements Comparator<EmpPro6> {

	@Override
	public int compare(EmpPro6 o1, EmpPro6 o2) {
		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
