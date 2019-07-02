package com.covalense.javaapp.assignmentsix;

import java.util.ArrayList;
import java.util.logging.Logger;

public class StudentMain {
	private static final Logger log = Logger.getLogger("StudentMain");

	public static void main(String[] args) {
		ArrayList<StudentBean> al = new ArrayList<StudentBean>();
		StudentBean s1 = new StudentBean(1, "abc");
		StudentBean s2 = new StudentBean(2, "pqr");
		StudentBean s3 = new StudentBean(3, "mno");
		StudentBean s4 = new StudentBean(4, "stu");
		StudentBean s5 = new StudentBean(5, "xyz");

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		for (StudentBean s : al) {
			log.info("Name is " + s.getName());
			log.info("Id is " + s.getId());
		}

	}

}
