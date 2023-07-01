package Jspider;
import java.util.Scanner;

public class LoopsF {

	
	public static void main(String[] args) {
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("ENTER A NUMBER");
			int n=scn.nextInt();
			int sum=0;
			for(int i=0;i<=n;i++)
			{
				sum+=i;
			}
			System.out.println("sum of 1 to "+n+"="+ sum);
		}
	}

}
