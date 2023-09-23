package Jspider;

public class WapaddEvennum 
{
	public static void main(String[] args) {
		WapaddOddnum.Test(); 
		int num=1234560789;
		int sum =0;
		while (num>0) 
		{
			int rem=num%10;
			if (rem%2==0) {
				sum+=rem;
				
			}
			num/=10;
			
		}
		System.out.println(sum);
	}
}
class WapaddOddnum
{
	static int num=1203456789;
	static int sum =0;
	public static void Test()
	{
	    while (num>0) 
	    {
		int rem=num%10;
		if (rem%2!=0) 
		{
			sum+=rem;
			
		}
		num/=10;
	    }
	    System.out.println(sum);
	}
	
	
}




