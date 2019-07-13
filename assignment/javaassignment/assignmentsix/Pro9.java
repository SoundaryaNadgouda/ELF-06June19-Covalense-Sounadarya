package com.covalense.javaapp.assignmentsix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pro9 {

	public static void main(String[] args) {
		ArrayList<StudentPro9> al = new ArrayList<StudentPro9>();

		StudentPro9 s1 = new StudentPro9();
		StudentPro9 s2 = new StudentPro9();
		StudentPro9 s3 = new StudentPro9();

		s1.set("soundarya", 23, 80);
		s2.set("soujanya", 28, 90);
		s3.set("shivani", 20, 100);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		HashMap<String, ArrayList<StudentPro9>> m = new HashMap<String, ArrayList<StudentPro9>>();
		m.put("Details", al);
		for (Map.Entry<String, ArrayList<StudentPro9>> e : m.entrySet()) {
			String key = e.getKey();
			System.out.println(key);
			ArrayList<StudentPro9> ar = e.getValue();
			for (StudentPro9 el : ar) {
				el.get();
			}

		}
	}
}
