package Jspider;

import java.util.Scanner;

public class Printrsqure {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER SQURE SIZE");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			
				for(int j=1;j<=n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
		

}
}