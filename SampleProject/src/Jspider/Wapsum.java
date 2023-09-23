package Jspider;

public class Wapsum { 
	public static void main(String[] args) {
		
		int num=12345;
		int sum=0;
		for(int i=0;0<num;i++)
		{
		
			int rem=num%10;
			sum+=rem;
			num/=10;
			
		}
	System.out.println(sum);
	}
	}



