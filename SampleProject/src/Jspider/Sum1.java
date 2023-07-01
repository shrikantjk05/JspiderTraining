package Jspider;

import java.util.Scanner;

public class Sum1 {//addition a given number (1234=1+2+3+4=10=1+0=1)

	public static void main(String[] args) {
		System.out.println("ENTER A NUMBER ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		do {
			sum=0;
			while(n>0)//158
			{
				sum+=(n%10);//8/5/1//4/1
				n/=10;//15/1/0/1/0
			}
			n=sum;
			
		}while(sum>9);
		System.out.println("n number is add total sum "+sum);//5

	}

}
