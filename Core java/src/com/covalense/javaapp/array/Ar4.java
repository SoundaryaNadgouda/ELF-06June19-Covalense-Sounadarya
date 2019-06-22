package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class Ar4 {

	public static void main(String[] args) {
		char[] a = { 'd', 'i', 'v', 'y', 'a' };
		for (int i = a.length - 1; i >= 0; i--) {
			log.info("result is "+a[i]);
		}
	}

}
