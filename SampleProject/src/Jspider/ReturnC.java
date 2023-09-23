package Jspider;

public class ReturnC {
	public static void main(String[] args) {
		int a=10;
		//a*=2;
		m1(a);
	a*=3;
		System.out.println("in main a="+a);
			
	}
	static void m1(int a)
	{
		System.out.println("in m1, a="+a);
		a*=2;
		System.out.println("in m1, a="+a);
	}

}
