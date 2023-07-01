package Jspider;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);// 5=5x5=25=reslut last digit 5 as same quest
		System.out.println("ENTER A NUMBER");
		int num = scn.nextInt();

		int temp = num;
		int sq = num * num;
		int d = 1;
		while (num > 0) {
			d = d * 10;
			num /= 10;
		}
		if (sq % d == temp) {
			System.out.println((d)+"AutoMorphic Number");
		} else
			System.out.println("Not Automorphic Number");
	}

}
