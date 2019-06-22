package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class Ar2 {

	public static void main(String[] args) {
		char[] a = new char[3];
		a[0] = 's';
		a[1] = 'o';
		a[2] = 'u';
		for (int i = 0; i < 3; i++) {
			log.info("name is " + a[i]);
		}
	}

}
