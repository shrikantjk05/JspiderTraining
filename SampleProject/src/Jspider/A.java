package Jspider;

public class A {
   int x = 10;
	
	public static void main(String[] args) {
		int x=10;     
		x=x+34;
		
        System.out.println(x);

		A nn=new A();
		//A nn1=new A();
		//A nn3=new A();
		System.out.println(nn.x);
		 x=20;
		nn.m1();
		
	}

	  void m1() {
		
		System.out.println("X value inside m1 method is "+x);
	}
}
