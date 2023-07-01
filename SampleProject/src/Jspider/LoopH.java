package Jspider;
import java.util.Scanner;


public class LoopH {

	//factorial numbers 1 to n?
	public static void main(String[] args) {
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("ENTER A NUMBER");
			int n=scn.nextInt();
			String s=" ";
			int prod=1;
			String m="!";
			for(int i=1;i<=n;i++)
			{
				
				prod=prod*i;
				s+=i;
				if(i<n) s+="*";
				System.out.print(i+""+m);
				System.out.println(s+"="+prod);
			}
			System.out.println(n+""+m+" "+s+"="+prod);
		}
		

	}

}
