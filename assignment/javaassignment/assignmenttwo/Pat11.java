package com.covalense.javaapp.assignmenttwo;

import java.util.Scanner;

public class Pat11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ënter no of rows");
		int n = s.nextInt();
		int c1 = (n - 1) / 2;

		// For printing lower portion
		int c2 = 3 * n / 2 - 1;

		// Loop denoting rows
		for (int i = 0; i < n; i++) {

			// Loop denoting columns
			for (int j = 0; j < n; j++) {

				// Checking conditions for printing
				// pattern
				if (i + j == c1 || i - j == c1 || j - i == c1 || i + j == c2
						|| i == c1 || j == c1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		s.close();
	}

}
