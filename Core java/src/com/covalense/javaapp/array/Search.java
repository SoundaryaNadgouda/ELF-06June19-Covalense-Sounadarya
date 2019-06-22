package com.covalense.javaapp.array;

import java.util.Scanner;

import lombok.extern.java.Log;
@Log
public class Search {

	public static void main(String[] args) {
		int counter, num, item, array[];
		// To capture user input
		Scanner input = new Scanner(System.in);
		log.info("Enter number of elements:");
		num = input.nextInt();
		// Creating array to store the all the numbers
		array = new int[num];
		log.info("Enter " + num + " integers");
		// Loop to store each numbers in array
		for (counter = 0; counter < num; counter++)
			array[counter] = input.nextInt();

		log.info("Enter the search value:");
		item = input.nextInt();
		input.close();
		for (counter = 0; counter < num; counter++) {
			if (array[counter] == item) {
				log.info(item + " is present at location " + (counter + 1));
				/*
				 * Item is found so to stop the search and to come out of the loop use break
				 * statement.
				 */
				break;
			}
		}
		if (counter == num)
			log.info(item + " doesn't exist in array.");
	}

}
