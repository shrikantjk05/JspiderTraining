package Jspider;

import java.util.Scanner;

public class FabonaciNumber {
	public static void main(String[] args) {
		System.out.println("ENTER A NUMBER ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 0, b = 1, c;
		for (int i = 1; i <= n; i++) {
			System.out.println(a + " ");
			c = a + b;
			a = b;
			b = c;

		}
	}

}
