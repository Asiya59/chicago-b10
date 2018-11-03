package day_40_classes_objects;

import java.util.ArrayList;
import java.util.List;

public class BookReader {
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "Unbeatable mind";
		b1.author = "Mark Devine";
		b1.pages = 300;
		
		Book b2 = new Book();
		b2.title = "Zero to one";
		b2.author = "Blake Masters";
		b2.pages = 130;
		
		Book b3 = new Book();
		b3.author = "Grant Cardone";
		b3.title = "Sell or Be Sold";
		b3.pages = 150;
		
		List<Book> myBooks = new ArrayList<>();
		myBooks.add(b1);
		myBooks.add(b2);
		myBooks.add(b3);
		
		for(Book book: myBooks) {
			System.out.println(book.author);
		}
		
	}

}












