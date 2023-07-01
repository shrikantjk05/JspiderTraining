package Jspider;

public class VariableArgumentsum {

	public static void main(String[] args) {
		
		System.out.println(add(4,6,7));
		
		
		System.out.println(add(4,1,2,3,6,7));
		
	}
	static int add(int...a)
	{
		int sum=0;
		for(int n:a)
		{
			sum+=n;
		}
		return sum;
	}
}
