package Jspider;

import java.util.Scanner;

public class Scondi {
	public static void main(String[] args) {
		System.out.println("Please enter number : ");
		Scanner sci=new Scanner(System.in);
		int n=sci.nextInt();
		int day=n;
		switch (day) {
		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid");

		}

	}
}
