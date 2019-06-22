package com.covalense.javaapp.objectclass;

import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) {
		Student s = new Student("abc", 56, 67.5);
		Student s1 = new Student("abc", 56, 67.5);
		log.info(" " + s.equals(s1));

	}

}
