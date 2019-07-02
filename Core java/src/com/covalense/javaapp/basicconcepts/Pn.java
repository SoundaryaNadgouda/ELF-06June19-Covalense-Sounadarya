package com.cov.javaapp.basicconcepts;

import lombok.extern.java.Log;

@Log
public class Pn {
	static void print(int n) {
		for (int i = 1; i >= 5; i++) {
			log.info(" "+i);
		}
	}

	public static void main(String[] args) {
		print(5);

	}

}
