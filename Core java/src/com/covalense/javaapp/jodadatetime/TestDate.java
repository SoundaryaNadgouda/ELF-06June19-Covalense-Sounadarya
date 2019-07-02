package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import lombok.extern.java.Log;
@Log
public class TestDate {

	public static void main(String[] args) {
		LocalDateTime l=LocalDateTime.of(1996, 2, 9, 5, 0);
		log.info(" "+l);
		LocalDate l1=LocalDate.now();
		log.info(" "+l1);
		Period p=Period.ofDays(30);
		log.info(" "+p);
	}

}
