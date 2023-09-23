package Jspider;

import java.util.Scanner;

public class ConstructorExample {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book s1 = BookCreate.create(sc);
		s1.display();
		
		s1.call();

		/*
		 * Book s2 = BookCreate.create(sc); s2.display();
		 * 
		 */

	}
}

class BookCreate {

	public static Book create(Scanner sc) {

		System.out.println("Enter Book Name : ");
		String bn = sc.nextLine();
		System.out.println("Enter Author name: ");
		String an = sc.nextLine();
		System.out.println("Enter book price: ");
		double p = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter paper type : ");
		String pt = sc.nextLine();

		Book b1 = new Book(bn, an, p, pt);
		return b1;
	}
}

class Paper {

	String paperType;

	Paper(){
		
	}
	Paper(String a) {
		this.paperType = a;
	}
	
	public void call() {
		System.out.println("paper type is : "+paperType);
	}

}

class Book extends Paper {

	String bookName;
	String autherName;
	double price;

	Book(String bookName, String autherName, double price, String papType) {
		super(papType);     //paperType = papType;
		this.bookName = bookName;
		this.autherName = autherName;
		this.price = price;
	}

	public void display() {
		String bookDetails = "Book [bookName=" + bookName + ", autherName=" + autherName + ", price=" + price + "]";
		System.out.println(bookDetails);

	}

}
