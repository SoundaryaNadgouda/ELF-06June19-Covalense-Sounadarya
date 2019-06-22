package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
public class Num {

	public static void main(String[] args) {
		int num = 41;
		if ((num % 2) == 0) {
			log.info("num is even");
		} else {
			log.info("num is odd");
		}

	}

}
