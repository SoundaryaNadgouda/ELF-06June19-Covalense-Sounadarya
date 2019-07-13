package com.covalense.javaapp.assignmentsix;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private String name;
	private int cost;
	private double rating;

	public ProductBean(String name, int cost, double rating) {
		super();
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

}
