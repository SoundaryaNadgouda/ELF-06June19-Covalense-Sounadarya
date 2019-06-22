package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class Ar3 {

	public static void main(String[] args) {
		String[] a = new String[3];
		a[0] = "sou";
		a[1] = "abc";
		a[2] = "xyz";

		for (int i = 0; i < a.length; i++) {
			log.info("names are " + a[i]);
		}

	}

}
