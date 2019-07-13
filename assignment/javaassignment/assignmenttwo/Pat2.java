package com.covalense.javaapp.assignmenttwo;

import java.util.Scanner;

public class Pat2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ënter no of rows");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
		s.close();
	}
}
