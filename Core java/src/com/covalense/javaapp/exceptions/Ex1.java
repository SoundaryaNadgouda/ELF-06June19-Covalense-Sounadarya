package com.covalense.javaapp.exceptions;
import lombok.extern.java.Log;
@Log
public class Ex1 {
	void cal() {
		int a = 10;
		int b = 2;
		int res;
		res = a / b;
		log.info("result is " + res);

	}
}
