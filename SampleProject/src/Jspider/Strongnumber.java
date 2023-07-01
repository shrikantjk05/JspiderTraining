package Jspider;

import java.util.Scanner;

public class Strongnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STARTING RANGE");
		int start = sc.nextInt();
		System.out.println("ENTER THE ENDING RANGE ");
		int end = sc.nextInt();
		for(int i=start;i<=end;i++)//remove loop we can check single value
		{
			int num=i;
			int sum=0;
			while(num>0)
			{
				int rem=num%10;
				int fact=1;
				for(int j =1;j<=rem;j++)
				{
					fact=fact*j;
					
				}
				sum+=fact;
				num/=10;
			}
			if(i==sum)
			{
				System.out.println(i);
			}
		}
}
}
