package Jspider;

public class VArgsString { 
	public static void main(String[] args) { //args
		int sum = 0;
		String [] a = { "1", "2" };    //String [] args = { "1", "2" }; duplicate variable name
		for (String s : a) {    //for (String s : args) args variable name is duplicate already in main method 

			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
	}

}
