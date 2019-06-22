package com.covalense.javaapp.eccapsulation;

public class Main9 {

	public static void main(String[] args) {
		Details d = new Details();
		Details d1 = new Details();

		Emp1 e1 = new Emp1();
		Emp2 e2 = new Emp2();

		d.setSal(20000);
		d.setName("soundarya");
		d.setGender("female");

		d1.setSal(10000);
		d1.setName("soujanya");
		d1.setGender("female");

		e1.store(d);
		e2.store(d1);

	}

}
