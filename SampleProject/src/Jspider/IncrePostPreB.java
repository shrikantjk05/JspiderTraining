package Jspider;

public class IncrePostPreB {
	public static void main(String[] args)
	{
		int a=0, b=0;
		System.out.println(b);
		System.out.println(a);
		b= a++ + ++a;
		System.out.println(b);
		System.out.println(a);
		System.out.println(a);//2
		int c=++a + a++ + ++a;//3+3+5=11
		System.out.println(c);
	}

}
