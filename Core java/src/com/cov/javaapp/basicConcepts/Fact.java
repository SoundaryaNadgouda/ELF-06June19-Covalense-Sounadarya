package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Fact {
	static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int res = fact(4);
		log.info("factorial of n is " + res);
	}

}
