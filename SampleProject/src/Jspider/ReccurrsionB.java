package Jspider;

public class ReccurrsionB {
	public static void main(String[] args) {
		m1(1);

	}

	static void m1(int i) {
		System.out.println(i);
		if (i == 3)
			return ;
		m1(1 + i);
		System.out.println(i);
		//System.out.println("m1 ends");
	}
}
