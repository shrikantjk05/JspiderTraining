package Jspider;

public class LoopB {


	public static void main(String[] args) {
		{
			int i=0;
			for(i=1;i<=20;i++)
			{
				System.out.println(i);
				i=i+i;
			}
			System.out.println(i);//1,3,7,15,31
		}
		
	
	}

}
