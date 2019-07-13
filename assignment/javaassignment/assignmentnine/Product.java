package com.covalense.javaapp.assignmentnine;

import lombok.extern.java.Log;

@Log
public class Product {

	String name;
	int cost;
	double rating;

	public Product(String name, int cost, double rating) {
		super();
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}

	void get() {
		log.info("name= " + name + "cost= " + cost + "rating= " + rating);
	}

}
