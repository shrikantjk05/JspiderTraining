package Jspider;

public class ConstructorExampleB {
	class Animal {
		// data member of Animal class
		public String color = "white";

	}

	// create child class of Animal
	class Cat extends Animal {
		// default constructor
		public String Name="ss";
		Cat() {
			// data members of the Cat class
			String color = "Brown";
			System.out.println("The cat is of color " + super.color); // calling parent class data member
			System.out.println("The cat is of color " + color);
		}
		public void PrintMyName()
		{
			
		}
	}

	// create child class for Car
	class SuperExample1 extends Cat {
		// default constructor
		public SuperExample1() {
			// calling base class constructor
			super();
			System.out.println("The eyes of the cat is blue.");
		}
	}

	// main() method start
	public static void main(String[] args) {
		ConstructorExampleB b = new ConstructorExampleB();
		// call default constructor of the SuperExample1
		b.new SuperExample1();		
		
		System.out.println("Inside Main");
		
	}
}
