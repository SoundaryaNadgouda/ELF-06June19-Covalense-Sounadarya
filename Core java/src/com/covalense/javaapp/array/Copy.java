package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class Copy {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 20, 40, 50, 60, 10 };
		int[] arr2 = new int[arr1.length];
		int i;
		for (i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		log.info("Elements of original array: ");
		for (i = 0; i < arr1.length; i++) {
					log.info(arr1[i] + " ");
		}

		log.info(" ");

		log.info("Elements of new array: ");
		for (i = 0; i < arr2.length; i++) {
			log.info(arr2[i] + " ");
		}
		boolean equalOrNot = true;

		if (arr1.length == arr2.length) {
			for (i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}

		if (equalOrNot) {
			log.info("Two Arrays Are Equal");
		} else {
			log.info("Two Arrays Are Not equal");
		}
	}

}
