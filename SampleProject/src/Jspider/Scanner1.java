package Jspider;
import java.util.Scanner;

public class Scanner1 {
	
		public static void main(String[] args)
		{
			Scanner scn=new Scanner (System.in);
			System.out.println("enter string value");
			String s1=scn.next();
			String s2=scn.next();
			String s3=scn.nextLine();
			
			System.out.println("s1="+s1);
			System.out.println("s2="+s2);
			System.out.println("s1 + s2="+(s1+s2));
			System.out.println("s3="+s3);


		}

	}



