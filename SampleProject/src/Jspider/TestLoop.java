package Jspider;

public class TestLoop {

	public static void main(String[] args) {
		
		int a=0, b=1, c;
		
		for (int j = 1; j <=10; j++) {
			
			System.out.print(a +",  ");
			 c=b+a;
			 a=b;
			 b=c;
			 
		}
		
	}
}
