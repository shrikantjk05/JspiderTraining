package Jspider;

public class ArraySortingEx {
public static void main(String[] args) {
	int a[]= {7,4,3,5,8,9,1,2,0};
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			int k=0; 
			if(a[i]> a[j]) {
				k=a[i];
				a[i]=a[j];	
				a[j]=k;
			}
		}
	}
	
	System.out.println("after data =-------");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
   }
}
