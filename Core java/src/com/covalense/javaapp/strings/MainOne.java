package com.covalense.javaapp.strings;

public class MainOne {

	public static void main(String[] args) {
		Emp e = new Emp(56, "xyz", 4000, "Male");
		Verify v = new Verify();
		v.check(e);
	}

}
