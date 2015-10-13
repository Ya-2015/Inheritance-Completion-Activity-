package InheritanceC;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTester {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<Book>();
		System.out.print("Do you want to input a book? y / n ");
		String input = scan.next();
		int index = 0;
		int pages = 0;
		while(input.equalsIgnoreCase("y")){
			books.add(new Book());
			index = books.size() - 1;
			
			System.out.print("Author: ?");
			input = scan.next();
			books.get(index).setAuthor(input);
			
			System.out.print("Pages: ?");
			pages = scan.nextInt();
			books.get(index).setPages(pages);
			
			System.out.println("Total Count: " + Product.getCount());
			
			System.out.print("Do you want to input a book? y / n ");
			input = scan.next();
		}
		
		ArrayList<Software> soft = new ArrayList<Software>();
		System.out.print("Do you want to input a software? y / n ");
		input = scan.next();
		
		while(input.equalsIgnoreCase("y")){
			soft.add(new Software());
			index = soft.size() - 1;
			
			System.out.print("Programmer: ?");
			input = scan.next();
			soft.get(index).setProgrammer(input);
			
			System.out.print("Platform: ?");
			input = scan.next();
			soft.get(index).setPlatform(input);
			
			System.out.print("OS: ?");
			input = scan.next();
			soft.get(index).setOs(input);
			
			System.out.println("Total Count: " + Product.getCount());
			
			System.out.print("Do you want to input a software? y / n ");
			input = scan.next();
		}
		
		for (Book b : books){
			System.out.println(b.toString("detail"));
		}
		
		for (Software s: soft){
			System.out.println(s.toString("detail"));
		}
		
	}
	
	
	
}
