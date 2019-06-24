package com.covalense.javaapp.assignment1;

import lombok.extern.java.Log;

@Log
public class Prnt2 {
	public static void cal() {
		for (int i = 1; i <= 100; i++) {
			if ((i % 2) != 0) {
				while (i % 7 == 0) {
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
