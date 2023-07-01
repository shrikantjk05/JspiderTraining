package Jspider;

import java.util.Scanner;//range 1 to n fibanacci number

public class FabnacciNumber3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UPPER Limit Number ");
		int U = sc.nextInt();
		System.out.println("Enter Lower Limit Number ");
		int L = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.println("FIBONACCI SERIES ");
		System.out.println("________________");
		while (a <= U) {
			if (a >= L) {
				System.out.println(a + " ");
			}
			c = a + b;
			a = b;
			b = c;

		}
	}
}
