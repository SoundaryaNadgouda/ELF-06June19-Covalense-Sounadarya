package com.covalense.javaapp.assignmentsix;

public class Mobile implements Comparable<Mobile> {

	String name;
	int price;
	double version;

	public Mobile(String name, int price, double version) {
		super();
		this.name = name;
		this.price = price;
		this.version = version;
	}

	public int compareTo(Mobile o) {
		if (this.price > o.price) {
			return 1;
		} else if (this.price < o.price) {
			return -1;
		} else
			return 0;
	}

}
