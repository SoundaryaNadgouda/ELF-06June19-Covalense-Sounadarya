package com.covalense.javaapp.polymorphism;

public class Give {

	public static void main(String[] args) {
		Pen p = new Pen();
		Writer w = new Writer();
		w.rcve(p);

	}

}
