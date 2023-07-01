package Jspider;

import java.util.Scanner;

public class LoofG {//natural numbers addition


	public static void main(String[] args) {
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("ENTER A NUMBER");
			int n=scn.nextInt();
			String s=" ";
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				sum+=i;
				s+=i;
				if(i<n) s+="+";		
				//System.out.println("i val is   "+i+"    s is "+s);
				System.out.println(s+"="+sum);
			}
			System.out.println(s+"="+sum);
			 /*5      1+=1
					 1+2+=3
					 1+2+3+=6
					 1+2+3+4+=10
					 1+2+3+4+5=15
					 1+2+3+4+5=15
*/
		}
		
	}

}
