package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Mul {
	static int fact(int n) {
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac = fac * i;
		}
		return fac;
	}

	public static void main(String[] args) {
		int res = fact(3);
		log.info("factorial of n is " + res);
	}

}
