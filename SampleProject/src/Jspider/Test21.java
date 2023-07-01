package Jspider;

import java.util.Scanner;

public class Test21 {//factorial numbers
	TestLoop lt;
	
	
	public static void main(String[] args) {
		System.out.println("Please enter number : ");
		Scanner sci=new Scanner(System.in);
		int n=sci.nextInt();
		int product =1;
		String s="";
		
		for (int i = 1; i <n ; i++) {
			if(i>1){
				s=s+"*"+i;	
			}else{
				s=s+i;
			}
			product = product* i;
			
			System.out.println(i +"!="+s+" = "+product);
		}
		/*
		for (int i = 1; i <= n; i++) {
			product = product*i;
			s=s+i;
			if(i<n){
				s=s+"*";
			}
			System.out.println(s +" = "+product);
			
		}*/
	}

}
