package Jspider;

import java.util.Scanner;

public class PrintHollowSquare1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER SQURE SIZE");
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i == 1) {//or if (i==1||i==n)

				for (int j = 1; j <= n; j++) {

					System.out.print("#");
				}
			}

			else {
				System.out.print("#");
				for (int j = 1; j <= n - 2; j++) {
					System.out.print(" ");
				}
				System.out.print("#");

			}
			System.out.println();
		}

	}
}
