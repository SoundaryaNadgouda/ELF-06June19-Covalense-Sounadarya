package com.covalense.javaapp.assignmentfour;

public class MainStu {

	public static void main(String[] args) {
		Student[] s = new Student[2];

		s[0] = new Student();

		s[0].setName("Sou");
		s[0].setAge(23);
		s[0].setSal(23000);

		s[1] = new Student();

		s[1].setName("Soujanya");
		s[1].setAge(28);
		s[1].setSal(30000);

		Db2 d2 = new Db2();
		d2.dispaly(s);
	}
}
