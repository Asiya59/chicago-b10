package day_40_classes_objects;

public class Student {
	
	String name;
	int age;
	String emai;
	
	public void read() {
		System.out.println("Student " + name + " is reading.");
	}
	
	public void read(Book book) {
		System.out.println("Student " + name + " is reading "+ book.title + " by " + book.author);
	}

}
