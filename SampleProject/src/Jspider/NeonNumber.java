package Jspider;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");//9=9x9=81=(8+1)=9
		int n=scn.nextInt();
		
		int temp=n;
		int sum =0;
		n=n*n;
		while (n>0)
		{int rem=n%10;
			sum+=rem;
			n/=10;
		}
		if (temp==sum)
		{
			System.out.println("Neon Number");
		}
		else
			System.out.println("Not Neon Number");
			
	}

}
