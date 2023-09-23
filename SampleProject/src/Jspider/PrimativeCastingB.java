package Jspider;

public class PrimativeCastingB {
	public static void main(String [] args) {
		int res1=(int) add(3,5);//narrowing
		System.out.println(res1);
	}
static double add(double a, double b)
{
	double res=a+b;
	return res;
}
}
