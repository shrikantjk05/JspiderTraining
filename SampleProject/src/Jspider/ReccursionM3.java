package Jspider;

public class ReccursionM3 {
	public static void main(String[] args) {
		m3(0, 2);
	}

	private static void m3(int start, int end) {

		if (start >= end)
			return;
		for (int i = start; i <= end; i++) {

			System.out.println(i);
			m3(start+1, end);
		}

	}
}
