package Jspider;

import java.util.Scanner;

public class TestAdmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++)

		{
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}

		}

	}
}
