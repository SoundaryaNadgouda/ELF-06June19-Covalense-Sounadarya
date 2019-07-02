package com.covalense.javaapp.assignmentsix;

@SuppressWarnings("serial")
public class NotValidNum extends Exception {
	String s = "pls provide positive number";

	@Override
	public String toString() {
		return s;
	}

}
