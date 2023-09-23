package Jspider;//prime number

import java.util.Scanner;

public class LoopJ {// prime number

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n = scn.nextInt();
		int count=0;
		for (int i = 2; i < n; i++) {
			
			if (isPrime(i)) {
				//count++;
				//if(count%2!=0){                    //ulternativprimenumber
				  System.out.println(i + "  PRIME");
				 // }
				 }
				
			}
	
	
		}

	

	public static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
			}
		}
		return flag;
	}
}
