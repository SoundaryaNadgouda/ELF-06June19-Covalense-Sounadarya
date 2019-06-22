package com.covalense.javaapp.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class Coll14 {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		log.info("Before----->"+al);
		
		Double d=al.set(2, 5.9);
		log.info(" "+d);
		
		log.info("After----->"+al);
		
	}

}
