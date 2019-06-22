package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
public class Simple {
	public static void main(String[] args) {
		int p = 15000, t = 2;
		double r = 14.92, si;
		si = (p * t * r) / 100;
		log.info(" " + si);
	}

}
