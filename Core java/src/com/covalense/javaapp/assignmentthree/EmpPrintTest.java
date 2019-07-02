package com.covalense.javaapp.assignmentonethree;


public class EmpPrintTest {

	public static void main(String[] args) {
		EmpPrint p = new EmpName();
		EmpPrint p1 = new EmpId();

		EmpNameIdRcve e = new EmpNameIdRcve();

		e.search(p);

	}

}
