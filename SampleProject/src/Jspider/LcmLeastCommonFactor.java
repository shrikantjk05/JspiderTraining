package Jspider;

import java.util.Scanner;

public class LcmLeastCommonFactor {
	public static void main(String[] args) {
		System.out.println("ENTER A NUMBER ");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A ");
		int a = sc.nextInt();
		System.out.println("ENTER B ");
		int b = sc.nextInt();
		int n = a > b ? a : b;
		int i = n;
		while (true) {
			if (n % a == 0 && n % b == 0) {
				
				break;
			}

			n++;
			n = n + i;

		}

		System.out.println(n);
	}
}
