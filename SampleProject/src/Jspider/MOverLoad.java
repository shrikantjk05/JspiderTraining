package Jspider;

public class MOverLoad {
	
	static void m1() {
		System.out.println("m1()");
	}

	static int m1(int a) {
		System.out.println(5);
		return 2;
	}

	static void m1(double a) {
		System.out.println("m1(double)");
	}
	static void m1(boolean a) {
		System.out.println("m1(boolean)");
	}

	public static void main(String[] args) {
		m1();
		m1(6);
		m1(7.8);
		m1(false);

System.out.println(m1(5));//return 2 output
	}
}
