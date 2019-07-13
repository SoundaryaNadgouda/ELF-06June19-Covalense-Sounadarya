package com.covalense.javaapp.assignmentsix;

import java.util.Comparator;

public class EmpByName implements Comparator<EmpPro6> {

	@Override
	public int compare(EmpPro6 o1, EmpPro6 o2) {
		return o1.name.compareTo(o2.name);
	}

}
