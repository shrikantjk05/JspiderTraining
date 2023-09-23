package Jspider;

public class ConstructorExampleA {
	// import required classes and packages  
	 
	  
	// create ThisExample1 class to understand the working of this() and this  
	class ThisExample1 {  
	      
	    // initialize instance and static variable 
	   int x = 6 ,stat=10;  
	      
	    // default constructor of class ThisExample1  
	    ThisExample1()  
	    {  
	        // invoking current class constructor  
	     this(1);
	        System.out.println("We are insie of the default constructor.");  
	        System.out.println("The value of x = "+x);
	        
	    }  
	  
	    ThisExample1(int x)  
	    {  
	         this.x=x;// override value of the current class instance variable  
	        System.out.println("We are inside of the parameterized constructor.");  
	        System.out.println("The value of y = "+x);  
	    }  
	  
	}
	    public static void main(String[] args)  
	    {  
	        // invoking constructor of the current class
	    	ConstructorExampleA a=new ConstructorExampleA();
	    a.new ThisExample1();  
	        System.out.println("Inside Main");  
	    }  
	  

}
