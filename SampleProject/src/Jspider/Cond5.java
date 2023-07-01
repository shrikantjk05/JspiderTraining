package Jspider;

import java.util.Scanner; //finding leap year with months

import com.techpalle.test.Test1;

public class Cond5 {
	
	Test21 tt;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER A YEAR&MONTH");
		int y = scn.nextInt();
		int m = scn.nextInt();

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10
				|| m == 12) {
			System.out.println("31days");
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.println("30days");
		} else if (m == 2) {
			if (y % 4 == 0 && y % 100 != 0) {
				System.out.println(y + " is a leap year");

		}
		else
		{
			System.out.println(y+"= is not a leap year");
		}
	}

}
}
