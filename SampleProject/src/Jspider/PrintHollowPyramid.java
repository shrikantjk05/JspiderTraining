package Jspider;

import java.util.Scanner;

public class PrintHollowPyramid {
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
				for (int j = 1; j <= stars; j++) 
				if(j==1||j==stars)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.println();
				if (i <= n / 2) {
					spaces--;
					stars += 2;
					;

				} else {
					spaces++;
					stars -= 2;
					

				}

			}

		}

	}


