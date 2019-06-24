package com.covalense.javaapp.assignment1;

import lombok.extern.java.Log;

@Log
public class Prnt3 {
	public static void cal() {
		for (int i = 50; i <= 100; i++) {
			if (i % 2 == 0) {
				while (i % 5 == 0) {
					log.info(" "+i);
					i++;
				}
			}
		}
	}

	public static void main(String[] args) {
		cal();
	}

}
