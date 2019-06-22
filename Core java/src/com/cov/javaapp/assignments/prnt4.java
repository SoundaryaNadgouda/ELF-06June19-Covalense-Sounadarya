package com.cov.javaapp.assignments;

import lombok.extern.java.Log;

@Log
public class prnt4 {
	public static void cal(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n / i == 0) {
				count++;
				break;
			}
		}
		if (count == 1) {
			log.info("Prime number");
		} else {
			log.info("not a prime number");
		}
	}

	public static void main(String[] args) {
		cal(3);
	}
}
