package Jspider;

public class Return {
	public static void main(String[] args) {

		int i = m1();
		System.out.println("i="+i);
		
		m1();
		//myName();
		System.out.println(m1());

		int j = m1() * 3;
		System.out.println("j=" + j);
		if (m1() == 10) {
			System.out.println("if excute");
		}
	}

	/*
	 * static void myName() { String Name= "shrikant"; }
	 */
	static int m1() {
		System.out.println("excuting m1");
		return 10;
	}

}
