package Jspider;

import java.util.Scanner;

public class Scond2 {
	CardsRecord rd;
	public static void main(String[] args) {
		System.out.println("Please enter number : ");
		Scanner sci = new Scanner(System.in);
		//int y = sci.nextInt();
		int m = sci.nextInt();
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30Days");
			break;
		case 2:
//			if (y % 4 == 0 && y % 100 != 0) {
//				System.out.println(y + " is a leap year");
//			} else {
//				System.out.println(y + "= is not a leap year");
//			}
//			break;
//		default:
//			System.out.println("Invalid Month");
		}
	}
}
