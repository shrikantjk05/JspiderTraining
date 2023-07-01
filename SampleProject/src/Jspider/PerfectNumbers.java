package Jspider;

import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) {
		System.out.println("ENTER A NUMBER ");
		Scanner sc = new Scanner(System.in); //6/1,2,3=6 perfect divisons nuumber add result same
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (n == sum) {
			System.out.println("PERFECT NUMBER");
		} else {
			System.out.println("ITS NOT A PERFECT NUMBER");
		}
	}
}
