package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Car {
	public static void main(String[] args) {
		long car = 570000l;
		long ex = 650000l;
		double rto;
		rto = (car * 14.26) / 100;
		double ins;
		ins = ex + rto;
		double orp;
		orp = car + rto + ins;
		log.info("ex is " + ex);
		log.info("rto is " + rto);
		log.info("ins is " + ins);
		log.info("orp is " + orp);
	}

}
