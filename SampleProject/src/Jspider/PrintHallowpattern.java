package Jspider;

import java.util.Scanner;

public class PrintHallowpattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER SQURE SIZE");
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || j == n || i == n) {
					System.out.print("#");}
					else 
					System.out.print(" ");
				
				
			}
			System.out.println();
		}
	}
}
