package Jspider;



public class PrintNumberRepeat {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int k = i; k <= n; k++) {
				System.out.print(k + " ");
			}

			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
