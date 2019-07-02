package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Bod {
	static double cal(double he, double we) {
		return we / (he * he);
	}

	static void check(double c) {
		if (c >= 18.5 && c <= 24.5) {
			log.info("normal");
		} else if (c <= 18.5) {
			log.info("underweight");
		} else if (c >= 25 && c <= 29.9) {
			log.info("overweight");
		} else {
			log.info("obesse");
		}

	}

	public static void main(String[] args) {

		double bmi = cal(51.5, 18.5);
		check(bmi);

	}

}
