package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Bign {
	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = 30;
		if ((a > b) && (a > c)) {
			log.info("a is greater");
		} else if ((b > a) && (b > c)) {
			log.info("b is greater");
		} else {
			log.info("c is greater");
		}
	}

}
