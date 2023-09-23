package Jspider;

public class ReccursionM2 { 
	public static void main(String[] args) {
		m2(1);
	}

	private static void m2(int i) {

		System.out.println(i);
		if(i==3) return;
		
		m2(i+1);
		m2(i+1);
		System.out.println(i);
	}

}
