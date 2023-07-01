package Jspider;

import java.util.Scanner;

public class LoopK {

	public static void main(String[] args) {
	
	
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n = scn.nextInt();
		boolean flag = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;

			}
		}
		
			if (flag) {
				System.out.println("  PRIME");}

			 else {
			System.out.println(" NOT PRIME");
				
			}
			
					
			
		}
	
			
	}


	

