package com.covalense.javaapp.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class Coll17 {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		log.info("Before----->"+al);
		
		ArrayList<Double> al1=new ArrayList<>();
		al1.add(154.67);
		al1.add(786.87);
		
		al.addAll(al1);
		
		log.info("After----->"+al);
		
	}

}
