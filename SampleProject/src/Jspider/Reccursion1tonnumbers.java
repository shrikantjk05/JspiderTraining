package Jspider;

public class Reccursion1tonnumbers {
	public static void main(String[] args) {
		display(1);
	}

	static void display(int n) {
		if (n > 10)
			return;
		System.out.println(n);
		 display(n + 1);
		
	}
}
