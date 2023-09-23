package Jspider;

import java.util.Iterator;
import java.util.Scanner;

public class Arraylinear {
	public static void main(String[] args) {
		
		System.out.println("Type Value");
		int x = 5;
		int[] array = { 2, 4, 8, 6, 5 };
        int n=array.length;
	    for (int i = 1;i<=n;i++) {
			if(i>n)
			{
				System.out.println("print eliment not found");
			}
			else 
				if(array[i]==x) {
				System.out.println("print x found at index "+i);
				break;
			}
			
		}
	}

}
