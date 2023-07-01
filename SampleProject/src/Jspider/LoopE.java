package Jspider;

import java.util.Scanner;

public class LoopE {


	public static void main(String[] args) 
			{
				Scanner scn=new Scanner(System.in);
				System.out.println("ENTER A NUMBER");
				int n=scn.nextInt();
				int sum=0;
				//System.out.println("ENTER A NUMBER");
				for(int i=1;i<=n;i++)
				{
					
			          sum+=i;
			          System.out.println(sum);
				}
				System.out.println(sum);
	}

}
