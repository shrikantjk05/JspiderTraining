package Jspider;

public class VariableArgumentsEx {

	public static void main(String[] args) {
		m1(12);
		m1(6, 23, 45,4,7);
		m1(9, 8, 3, 9);
	}

	private static void m1(int ...a) {
		//System.out.println(a.length);
		//System.out.println(a[0]);
		System.out.println("----------");
		for (int n : a) {
			System.out.println(n);
		}
		/*
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */
		
	}
}
