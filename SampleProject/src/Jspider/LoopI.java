package Jspider;
import java.util.Scanner;


public class LoopI {//multiplication table


	public static void main(String[] args) {
		
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("ENTER A NUMBER");
			int n=scn.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println(n +"*"+i+"=" +(n*i));
			}
		}/*5
		5*1=5
		5*2=10
		5*3=15
		5*4=20
		5*5=25*/

		

	}

}
