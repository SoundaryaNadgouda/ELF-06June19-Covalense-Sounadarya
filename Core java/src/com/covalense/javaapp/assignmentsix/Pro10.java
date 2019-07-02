package com.covalense.javaapp.assignmentsix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pro10 {

	public static void main(String[] args) {

		ArrayList<EmployeePro10> al = new ArrayList<>();
		EmployeePro10 e1 = new EmployeePro10();
		EmployeePro10 e2 = new EmployeePro10();
		EmployeePro10 e3 = new EmployeePro10();

		e1.set("Soundarya", 23, "Engineer", 23000);
		e2.set("Shivani", 33, "Manager", 50000);
		e3.set("Soujanya", 28, "TechManager", 40000);

		al.add(e1);
		al.add(e2);
		al.add(e3);

		HashMap<String, ArrayList<EmployeePro10>> m = new HashMap<>();
		m.put("Details", al);

		for (Map.Entry<String, ArrayList<EmployeePro10>> e : m.entrySet()) {
			String key = e.getKey();
			System.out.println(key);
			ArrayList<EmployeePro10> ae = e.getValue();

			for (EmployeePro10 el : ae) {
				el.get();
			}

		}
	}
}
