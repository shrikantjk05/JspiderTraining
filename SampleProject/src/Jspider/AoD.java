package Jspider;

public class AoD {
	public static void main(String[] args)
	{
		int a=4725;
		a/=10;
		System.out.println(a);
		a/=10;
		System.out.println(a);
		a/=10;
		System.out.println(a);
		a/=10;
		System.out.println(a);
		AoD.m1();
	}
	public static void m1()
	{
		int a=4725;
		a%=10;
		System.out.println(a);
		a%=10;
		System.out.println(a);
		a%=10;
		System.out.println(a);
		a%=10;
		System.out.println(a);
	}
}
