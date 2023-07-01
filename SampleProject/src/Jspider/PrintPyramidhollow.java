package Jspider;

import java.util.Scanner;

public class PrintPyramidhollow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER PATTERN SIZE");
		int n = scn.nextInt();

		int spaces = n - 1;
		int stars = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= spaces; j++) {

				System.out.print(" ");

			}
			for (int j = 1; j <= stars; j++) {
				if(i==n||j==1||j==stars)
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");

			}
			System.out.println();
			spaces--;
			stars+=2;;


			

		}

	}
}
