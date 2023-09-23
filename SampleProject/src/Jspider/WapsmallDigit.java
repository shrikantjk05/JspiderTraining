package Jspider;

public class WapsmallDigit {
	public static void main(String[] args) {
		int num = 91426;
		int min=9;

		while (0 < num) {
			int rem = num % 10;
			
			
			if (min>rem) {
				min=rem;
			}
			num/=10;

		}
		System.out.println("Smallest Digit" +"="+ min);

	}

}
