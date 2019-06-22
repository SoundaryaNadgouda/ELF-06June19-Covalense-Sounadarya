package com.covalense.javaapp.exceptions;

import lombok.extern.java.Log;

@Log
public class Ex {

	public static void main(String[] args) {
		int []a1 = { 1, 2, 3 };
		String s = null;
		log.info("main started");
		try {
			log.info(" " + a1[5]);
		} catch (ArrayIndexOutOfBoundsException ai) {
			log.info("invalid");
		}
			finally {
			try {
				log.info(" " + s.length());
			}
		 catch (NullPointerException np) {
			log.info("provide some string");
		}
		log.info("main ended");
	}
	}
}
