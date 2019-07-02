package com.covalense.javaapp.assignmentfour;

import com.covalense.javaapp.assignmentsix.Product;

public class MainPro {

	public static void main(String[] args) {
		Product[] p = new Product[2];

		p[0] = new Product();

		p[0].setName("Car");
		p[0].setCost(800000);
		p[0].setBrand("Audi");

		p[1] = new Product();

		p[1].setName("Bike");
		p[1].setCost(250000);
		p[1].setBrand("KTM Duke");

		Db1 d1 = new Db1();
		d1.dispaly(p);
	}

}
