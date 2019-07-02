package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Age {
	public static void main(String[] args) {
		int age = 70;
		double dis = 15.2;
		double price = 250;
		if (age > 60) {
			price = price - (price * dis) / 100;
			log.info("the payable amount is " + price);
		}
	}

}
