package Jspider;

import java.util.Scanner;

public class ByntoDecimalloop {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER DECIMAL NUMBER");
		int num=scn.nextInt();
		int i=1;
		int dec=0;  
		while(num>0)
		{
			int rem=num%10;
			dec=dec+rem*i;
			num/=10;
		    i*=2;
			
		}
		System.out.println(dec);
}
}