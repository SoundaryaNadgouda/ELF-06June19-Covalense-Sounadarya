package com.cov.javaapp.basicConcepts;

import lombok.extern.java.Log;

@Log
public class Gr {
	public static void main(String[] args) {
		int a = 95;
		if (a > 90) {
			log.info("a's grade is A");
		} else if (a > 35) {
			log.info("a's grade is B");
		} else if (a < 35) {
			log.info("fail");
		}
	}

}
