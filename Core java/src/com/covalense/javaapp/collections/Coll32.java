package com.covalense.javaapp.collections;

import java.util.TreeSet;
import lombok.extern.java.Log;
@Log
public class Coll32 {

	public static void main(String[] args) {
		TreeSet<Product> t=new TreeSet<>();
		Product p1=new Product();
		p1.name="Car";
		p1.cost=20000;
		p1.rating=6.5;
		
		Product p2=new Product();
		p2.name="Bike";
		p2.cost=30000;
		p2.rating=7.5;
		
		Product p3=new Product();
		p3.name="Timpo";
		p3.cost=40000;
		p3.rating=8.5;
		
		t.add(p1);
		t.add(p2);
		t.add(p3);
		
		
		
		for(Product p:t) {
		log.info("name is "+p.name);
		log.info("Cost is "+p.cost);
	log.info("Rating is "+p.rating);
			
			
	}
	}
}
