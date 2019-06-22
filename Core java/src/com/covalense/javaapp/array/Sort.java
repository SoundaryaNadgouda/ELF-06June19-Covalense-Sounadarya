package com.covalense.javaapp.array;

import java.util.Arrays;
import java.util.Scanner;

import lombok.extern.java.Log;
@Log
public class Sort {

	public static void main(String[] args) {
		int count;

		// User inputs the array size
		Scanner scan = new Scanner(System.in);
		log.info("Enter number of elements you want in the array: ");
		count = scan.nextInt();

		Integer num[] = new Integer[count];
		log.info("Enter array elements:");
		for (int i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(num);
		int k = Arrays.binarySearch(num, 5);
		log.info("Array Elements ");
		for (int i = 0; i < count - 1; i++) {
			log.info(num[i] + ", ");
		}
			log.info(" "+num[count - 1]);
		log.info("array index is " + k);
	}
}
