package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Cond {
	public static void main(String[] args) {
		int id = 1;
		int amt = 100;
		double dis = 10;
		if (id == 1) {
			log.info("the money need to pay is " + (amt - dis));
		} else {
			log.info("the money need to pay is " + amt);
		}
	}

}
