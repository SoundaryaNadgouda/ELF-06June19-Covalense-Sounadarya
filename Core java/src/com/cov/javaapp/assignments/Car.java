package com.cov.javaapp.assignments;

public class Car {

	public static void main(String[] args) {
		Benz b = new Benz();
		Audi a1 = new Audi();
		Drive d = new Drive();
		d.take(b);
		d.take(a1);
	}

}
