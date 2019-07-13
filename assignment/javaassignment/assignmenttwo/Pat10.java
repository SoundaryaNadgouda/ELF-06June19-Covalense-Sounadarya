package com.covalense.javaapp.assignmenttwo;

import java.util.Scanner;

public class Pat10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ënter no of rows");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 3 || i == (n / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		s.close();
	}

}
