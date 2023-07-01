package Jspider;
import java.util.Scanner; //finding leap year with months

public class Cond4 {
public static void main(String[] args){
		
		Scanner scn=new Scanner (System.in);
		System.out.println("ENTER A YEAR");
		int year=scn.nextInt();
		
		if(year%400==0)
		{
			System.out.println(year+" is a leap year");
			
		}
		else if(year%4==0&&year%100!=0)
		{
			System.out.println(year+" is a leap year");
			
		}
		else
		{
			System.out.println(year+"= is not a leap year");
		}
		
		
		
}
}
