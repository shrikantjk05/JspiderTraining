package Jspider;

public class Wapcount {
	public static void main(String[] args) {
		
	int num=12345;
	int count=0;
	while(0<num)
	{
	
		int rem=num%10;
		count++;
		num/=10;
		System.out.print(rem);
	}
System.out.println(count);
}
}
