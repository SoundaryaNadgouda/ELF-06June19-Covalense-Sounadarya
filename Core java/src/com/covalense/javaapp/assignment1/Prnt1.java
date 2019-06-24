package com.covalense.javaapp.assignment1;

import lombok.extern.java.Log;

@Log
class Prnt1 {
	public static void cal(int i) {
		while (i <= 60) {
			log.info(" "+i);
			i++;
		}
	}

	public static void main(String[] args) {
		cal(50);
	}

}
