package Jspider;

import java.util.Scanner;
//given number sum like 1234=1+2+3+4=10
public class Sum {
	public static void main(String[] args) {
		System.out.println("ENTER A NUMBER ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		System.out.println(sum);
}
}