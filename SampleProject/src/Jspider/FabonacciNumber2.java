package Jspider;

import java.util.Scanner;

public class FabonacciNumber2 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0, b = 1, c;
		System.out.println("FIBONACCI NUMBER ");
		System.out.println("________________");
		while (a <= n) {
			System.out.println(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

	}
}