package Jspider;

public class ReturnF {
	public static void main(String[] args) {
		int i = 0, j = 0;
		j = m1(++i) + m1(i++);

		System.out.println("i=" + i);
		System.out.println("j=" + j);

	}

	static int m1(int a) {

		return a++;// nothing is return
	}

}
