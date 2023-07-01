package Jspider;

public class IncrePostPreC {
	public static void main(String[] args)
	{
		int a=0;
		 a= ++a;
		System.out.println(a);
		a= ++a;
		System.out.println(a);
		a= a++;
		System.out.println(a);
		a= a++;
		System.out.println(a);
		IncrePostPreC.m();
	}
	public static void m()
	{
		int a=0;
	
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a++);
	}
}
