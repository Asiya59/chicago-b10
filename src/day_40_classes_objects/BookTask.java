package day_40_classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTask {
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of books: ");
		int bookNum = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < bookNum; i++) {
			Book book = new Book();
			System.out.println("Please enter author for book " + (i+1) + ":");
			book.author = scan.nextLine();
			System.out.println("Please enter title for a book "+ (i+1) + ":");
			book.title = scan.nextLine();
			System.out.println("Please enter pages for a book "+ (i+1) + ":");
			book.pages = scan.nextInt();
			scan.nextLine();
			books.add(book);
		}
		System.out.println("Size: " + books.size());
		System.out.println(books.get(0).author);
		System.out.println(books.get(1).author);
		
	}

	
	
	
	
	
	
	
	
	
	
	
}













