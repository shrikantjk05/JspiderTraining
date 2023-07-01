package Jspider;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("ARMSTRONG NUMBER CHECK ");
		System.out.println("ENTER NUMBER ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numcopy = n;
		int count = 0;
		
		while(n>0)
		{
			count++;
			n/=10;//n=n/10;
		}
		System.out.println("count"+count);
		n=numcopy;
		int sum =0;
		
		while(n>0)
		{
			int d =n%10;//9/8
			int prod = 1;
			for(int i =1;i<=count;i++)
			{
				prod*=d;//9/81/729//8/64/512
				
			}
		System.err.println(d+"pow"+count+"="+prod);
		sum+=prod;
		n/=10;
		System.out.println("sum"+sum);
		if(sum==numcopy) {
			System.out.println("Number Is Armstrong");
				
			}
		else 
			System.out.println("Number Is not Armstrong");
		
			
		}

	}
}