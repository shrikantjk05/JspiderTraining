package Jspider;

public class Loopsiterate {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.println(i + "   " + j);
				if (i == 3) {
					break;
					//continue;
				}

				System.out.println(i);
			}
			System.out.println(i);
		}
	}
}
