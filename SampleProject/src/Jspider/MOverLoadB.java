package Jspider;

public class MOverLoadB { 
static void m1(int a)
{
	System.out.println("m1(int)"+a);
}
static void m1(int...a)
{
	System.out.println("m1(int...)");
}
public static void main(String[] args) {
	
	m1(1);
	m1(1,2,3);
	m1();
	
	
	
}
}
