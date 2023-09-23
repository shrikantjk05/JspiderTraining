package Jspider;

public class Reccursion {
	static  void m1(int i) {
		System.out.println(i);
		if (i == 2) {
			return ;
		}
			
		m1(i + 1);
		System.out.println(i);
		System.out.println("m1 ends");

	}

	public static void main(String[] args) {
		  m1(1);
	}
}