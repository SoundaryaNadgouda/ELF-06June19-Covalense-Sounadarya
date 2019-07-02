package com.covalense.javaapp.assignmentonethree;

public class EmpNameIdRcve {
	void search(EmpPrint p) {
		if (p instanceof EmpName) {
			System.out.println("emp name is ABC");
		} else if (p instanceof EmpId) {
			System.out.println("emp id is 3");
		}
	}

}
