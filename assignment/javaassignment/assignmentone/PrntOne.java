package com.covalense.javaapp.assignmentone;

import lombok.extern.java.Log;

@Log
class PrntOne {
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
