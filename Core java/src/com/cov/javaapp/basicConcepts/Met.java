package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Met {
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int res = add(2, 3);
		log.info("result is " + res);

	}

}
