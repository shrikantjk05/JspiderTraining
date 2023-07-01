package Jspider;

import java.util.Scanner;

public class TestLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter A value : ");
			int a = sc.nextInt();
			System.out.println("Enter B value : ");
			int b = sc.nextInt();
			int c = AddNumbers(a, b);
			System.out.println("Sum result is " + c);
			int my = a * c;
			System.out.println("Result multiplier " + my);

			System.out.println("Do you want to continue Y/N ");
			String cnt = sc.next();
			if (cnt.equals("N")) {
				flag = false;
			}
		}
		System.out.println("Completed ..... !");

	}

	public static int AddNumbers(int x, int y) {
		System.out.println("Add these 2 numbers");
		int z = x + y;
		return z;
	}
}
