package com.covalense.javaapp.exceptions;
import lombok.extern.java.Log;
@Log
public class Main {

	public static void main(String[] args) {
		Ex2 e2 = new Ex2();
		log.info("main started");
		try {
			e2.check();
		} catch (ArithmeticException ae) {
			log.info("provide non zero input");
		} catch (ArrayIndexOutOfBoundsException ai) {
			log.info("provide some value");
		}
		log.info("main ended");
	}

}
