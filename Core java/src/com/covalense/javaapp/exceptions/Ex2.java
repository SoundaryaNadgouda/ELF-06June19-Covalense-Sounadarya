package com.covalense.javaapp.exceptions;
import lombok.extern.java.Log;
@Log
public class Ex2 {
	void check() {
		Ex1 e1 = new Ex1();
		e1.cal();
		int []a1 = { 2, 3, 4 };
		log.info(" "+a1[7]);
		
	}
}
