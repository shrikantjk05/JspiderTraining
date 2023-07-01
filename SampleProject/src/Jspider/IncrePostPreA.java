package Jspider;

public class IncrePostPreA {
public static void main(String[] args)
{int a=0;
 int b=a+++2;
System.out.println(a);
System.out.println(b);
int c=0;
int d=++c+2;
System.out.println(c);
System.out.println(d);
IncrePostPreA.m();//caling method

}
public static void m()
{   int e=1;
	int f=e+++2;
    System.out.println(f);
    System.out.println(e);
}
}
