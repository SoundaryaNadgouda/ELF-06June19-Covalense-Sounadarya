package com.covalense.javaapp.assignmenttwo;

import java.util.Scanner;

public class Pat7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ënter no of rows");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		s.close();
	}

}
