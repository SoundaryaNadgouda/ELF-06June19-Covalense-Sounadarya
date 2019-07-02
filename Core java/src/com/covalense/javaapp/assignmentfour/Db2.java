package com.covalense.javaapp.assignmentfour;

public class Db2 {
	void dispaly(Student s[]) {
		for (int i = 0; i <= s.length - 1; i++) {
			System.out.println("Name is: " + s[i].getName());
			System.out.println("Age is: " + s[i].getAge());
			System.out.println("Sal is: " + s[i].getSal());
			System.out.println("********************************");
		}
	}
}
