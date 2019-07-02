package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Bmi {
	public static void main(String[] args) {
		double bmi;
		double we = 41.4;
		double height = 5;
		bmi = we / (height * height);
		log.info(" " + bmi);
	}
}
