package com.covalense.javaapp.collections;

import java.util.TreeSet;
import lombok.extern.java.Log;
@Log
public class Coll33 {

	public static void main(String[] args) {
		TreeSet<Car> t=new TreeSet<>();
		Car c1=new Car();
		c1.name="Indica";
		c1.brand="D";
		c1.cost=20000;
		c1.rating=2.5;
		
		Car c2=new Car();
		c2.name="Audi";
		c2.brand="b";
		c2.cost=10000;
		c2.rating=5.5;
		
		Car c3=new Car();
		c3.name="Suzuki";
		c3.brand="A";
		c3.cost=50000;
		c3.rating=9.5;
		
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		
		
		for(Car c:t) {
			log.info("Name is "+c.name);
			log.info("Brand is "+c.brand);
			log.info("Cost is "+c.cost);
			log.info("Rating is "+c.rating);
			
			
	}
	}
}
