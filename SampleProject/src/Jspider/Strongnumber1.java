package Jspider;

import java.util.Scanner;

public class Strongnumber1 {
	public static void main(String[] args) {
		System.out.println("ENTER NUMBER ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int numcopy = n;

		while (n > 0) {
			int d = n % 10;
			int fact = 1;
			for (int i = 1; i <= d; i++) {
				fact *= i;
			}

			sum += fact;

			n /= 10;
		}

			if (numcopy == sum) {
				System.out.println("Strong Number");

			} else
				System.out.println("Not Strong Number");

		}
	}


