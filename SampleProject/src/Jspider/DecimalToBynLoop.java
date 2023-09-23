package Jspider;

import java.util.Scanner;

public class DecimalToBynLoop {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER DECIMAL NUMBER");
		int num=scn.nextInt();
		int i=1;
		int bin=0;
		while(num>0)
		{
			int rem=num%2;
			bin=bin+rem*i;
			i=i*10;
			num/=2;
			
		}
		System.out.println(bin+i);
		
}
}