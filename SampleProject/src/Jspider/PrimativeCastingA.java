package Jspider;

public class PrimativeCastingA { 
	public static void main(String [] args) {
		m1(3.456);//auto widening
		m1(5);//auto widening
		m1('a');
		
	}
	static void m1(double d) {
		System.out.println("d="+d);
	}

}
