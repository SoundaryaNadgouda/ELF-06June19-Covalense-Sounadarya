package com.covalense.javaapp.abstractionclass;

public class Main3 {

	public static void main(String[] args) {
		Mac m = new Mac();
		Icici i = new Icici();
		Atm a = new Hdfc();
		Atm a1 = new Sbi();
		a.valid();
		a.info();
		m.check(i);
		a1.valid();

	}

}
