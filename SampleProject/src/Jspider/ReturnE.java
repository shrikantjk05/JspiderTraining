package Jspider;

public class ReturnE {
	public static void main(String[] args) {

		System.out.println(m1());
	}

	static int m1() {

		int a = 0;
		a++;

		System.out.println("a=" + a);
		return (a++);

	}

}
