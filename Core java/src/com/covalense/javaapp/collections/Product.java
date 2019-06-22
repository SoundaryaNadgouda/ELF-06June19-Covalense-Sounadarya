package com.covalense.javaapp.collections;

public class Product implements Comparable<Product> {
	String name;
	int cost;
	double rating;
	
	public int compareTo(Product p) {
	if(this.rating<p.rating) {
	return 1;
}
	else if(this.rating>p.rating) {
	return -1;
}
	else {
	return 0;
}
}
}