package day_40_classes_objects;

public class RealEstate {

	public static void main(String[] args) {
//		House h1 = new House();
//		h1.type = "Apartment";
//		h1.rooms = 3;
//		h1.address = "123 Main St";
//		
//		House h2 = new House();
//		h2.type = "TownHouse";
//		h2.rooms = 4;
//		h2.address = "4545 adam ave";
//		
//		System.out.println(h1.address);
//		System.out.println(h2.rooms);
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "James";
		s1.age = 40;
		s1.emai = "james@gmail.com";
		
		s2.name = "Adam";
		s2.age = 34;
		s2.emai = "adam2018@gmail.com";
		s1.read();
		s2.read();
		Book book = new Book();
		book.author = "Mark Devine";
		book.title = "Unbeatable mind";
		book.pages = 400;
		s1.read(book);
	}
}












