package Jspider;

public class VarArgs {
	
	public static void main(String[] args) {

		m1(4);
		m1(3, 5, 6);
		m1(3, 4, 5, 6, 7, 8, 9);

	}

	static void m1(int... a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}