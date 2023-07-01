package Jspider;

import java.util.Scanner;

public class ArmstrongnumbRange {
	public static void main(String[] args) {
		System.out.println("ARMSTRONG NUMBER SERIES ");
		Scanner sc = new Scanner(System.in);
		System.out.println("START");
		int start = sc.nextInt();
		System.out.println("END");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {

			int num = i;
			int temp = num;
			int count = 0;
			while (num > 0) {
				count++;
				num /= 10;
			}
			num = temp;
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				int fact = 1;
				for (int j = 1; j <= count; j++) {
					fact = fact * rem;

				}
				num /= 10;
				sum = sum + fact;

			}

			if (temp == sum) {
				System.out.println(" the number is amstrong " + sum);
			}

		}
	}

}