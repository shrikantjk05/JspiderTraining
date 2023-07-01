package Jspider;

public class C {

	
	public static void main(String[] args) {
		
		System.out.println("main starts");
        int a=10;
        System.out.println(a);
        C.M1();
        a=20;
        System.out.println(a);
        System.out.println("main ends");
	}

	public static void M1()
	{
		System.out.println("m1 starts");
		System.out.println("m1 ends");
	}
}
