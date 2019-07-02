package com.covalense.javaapp.assignmenttwo;

import java.util.Scanner;

public class Pat9 {

	public static void main(String[] args) {
		int i, j, k;
		Scanner s = new Scanner(System.in);
		System.out.print("ënter no of rows");
		int n = s.nextInt();
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= 5 - i + 1; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * (5 - i + 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		s.close();
	}
}
