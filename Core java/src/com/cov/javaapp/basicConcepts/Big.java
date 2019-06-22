package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
public class Big {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		if (a > b) {
			log.info("a is greater");
		} else {
			log.info("b is greater");
		}
	}

}
