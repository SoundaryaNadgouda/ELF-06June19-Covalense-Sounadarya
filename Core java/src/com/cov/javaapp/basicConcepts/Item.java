package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
public class Item {
	public static void main(String[] args) {
		int amt = 50;
		switch (amt) {
		case 10:
			log.info("lays");
			break;
		case 20:
			log.info("kurkure");
			break;
		case 50:
			log.info("silk");
			break;
		default:
			log.info("invalid");

		}
	}

}
