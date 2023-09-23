package Jspider;

public class ReturnB {
	public static void main(String[] args) {
		m1(2);
		m1(2 + 3);
		int n = 6;
		m1(n);
	}

	static void m1(int a)

	{
		System.out.println("a=" + a);
	}

}

