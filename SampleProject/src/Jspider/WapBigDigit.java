package Jspider;

import java.util.Iterator;

public class WapBigDigit {
	public static void main(String[] args) {
		int num = 914826;
		int max=0;
		for (int i = 0;0<num; i++) {
			int rem=num%10;
			
			if (max<rem) {
				max=rem;
			}
			num/=10;
		}
		System.out.println(max);
	}

}
