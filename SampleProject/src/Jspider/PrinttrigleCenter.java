package Jspider;

import java.util.Scanner;

public class PrinttrigleCenter {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER TRIANGLE SIZE");
		int n = scn.nextInt();

		int stars = n;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
            stars--;
		}
	}
}