package com.covalense.javaapp.assignmentfour;

import com.covalense.javaapp.assignmentsix.Product;

public class Db1 {
	void dispaly(Product a[]) {
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Name is: " + a[i].getName());
			System.out.println("Cost is: " + a[i].getCost());
			System.out.println("Brand is: " + a[i].getBrand());
			System.out.println("********************************");
		}
	}
}
