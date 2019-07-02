package com.covalense.javaapp.encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Details d = new Details();
		Details d1 = new Details();

		EmpOne e1 = new EmpOne();
		EmpTwo e2 = new EmpTwo();

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
