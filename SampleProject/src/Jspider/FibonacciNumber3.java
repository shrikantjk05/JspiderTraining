package Jspider;


public class FibonacciNumber3 {
	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//int U = sc.nextInt();
		//int L = sc.nextInt();
		int a = 0, b = 2, c;
		System.out.println("MAIN STARTS");

		for (int i = 0; i < 20; i++) {
			
			if(i==12){
				System.out.println("I value is "+i +" and Break is met so for loop is stopped");
				break;
			}
			
			if(i==4){
				System.out.println("I value met to "+i +"  so below calculation is jumped to next number");
				continue;
			}
			int x= b*b+i;
			System.out.println("Sum result of i "+i +"  is equal to "+x);
		
			
		}
		
		System.out.println("End //..............//");
		/*for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				break;
			System.out.println(i);

		}*/
		System.out.println("MAIN ENDS");
	}
}