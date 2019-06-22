package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
public class Lang {

	public static void main(String[] args) {
		int num = 1;
		switch (num) {
		case 1:
			log.info("kannada");
			break;
		case 2:
			log.info("telgu");
			break;
		case 3:
			log.info("hindi");
			break;
		default:
			log.info("korean");
		}
	}

}
