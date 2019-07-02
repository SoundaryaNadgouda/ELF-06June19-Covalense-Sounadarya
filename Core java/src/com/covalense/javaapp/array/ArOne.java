package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArOne {

	public static void main(String[] args) {
		double[] a = new double[4];
		a[0] = 2.3;
		a[1] = 7.8;
		a[2] = 6.8;
		a[3] = 647.8;
		for (int i = 0; i < 4; i++) {
			log.info("array elements are " + a[i]);
		}

	}

}
