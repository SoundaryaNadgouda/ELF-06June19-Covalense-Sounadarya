package com.covalense.javaapp.assignmentone;

import lombok.extern.java.Log;

@Log
public class Print {
	public static void cal(int i) {
		while (i >= 1) {
			log.info(" "+i);
			i--;
		}
	}

	public static void main(String[] args) {
		cal(5);
	}

}
