package Jspider;

import java.util.Scanner;

public class DigitsReverpattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER PATTERN SIZE");
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			
				if (i%2!=0)
				{
					int k=((i-1)*n)+1;
					for (int j = 1; j <= n; j++) {
					
					System.out.print(k+"\t");
					k++;

				}
				}
					else
					{
						int k=i*n;
						for(int j=1;j<=n;j++)
						{
							System.out.print(k+"\t");
							k--;
						}
					}
					System.out.println();
					
}
	}
	}
	
	
	