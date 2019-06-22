package com.covalense.javaapp.array;

import java.util.logging.Logger;

interface Fact {
	int fact(int n);
}

public class LambdaExp1 {
	public static final Logger log=Logger.getLogger("LambdaExp");
	public static void main(String[] args) {
		Fact f = a -> {
			int n = 1;
			for (int i = 1; i <= a; i++) {
				n = n * i;
			}
			return n;
		};
		int res = f.fact(5);
		log.info("factorial is " + res);
	}

}
