package com.covalense.javaapp.implementlambda;
import lombok.extern.java.Log;
@Log
public class TestTryCatch {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
			log.info(" "+c);
		}catch(ArithmeticException | NullPointerException e) {
		log.info("arithmatic exception");
	}catch(Exception e) {
		log.info("exception");
	}
	}
}