package com.covalense.javaapp.exceptions;
import lombok.extern.java.Log;
@Log
public class ExTwo {
	void check() {
		ExOne e1 = new ExOne();
		e1.cal();
		int []a1 = { 2, 3, 4 };
		log.info(" "+a1[7]);
		
	}
}
