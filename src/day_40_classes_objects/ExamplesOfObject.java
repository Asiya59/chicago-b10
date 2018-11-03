package day_40_classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamplesOfObject {
	
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.model = "Macbook Pro";
		c1.color = "White";
		c1.isNew = true;
		c1.memory = 256;
		c1.size = 16;
		
		c1.turnOn();
		c1.turnOff();
		Computer c2 = new Computer();
		c2.model = "Dell";
		c2.turnOff();
		
//		Book b = new Book();
//		b.author = "James";
//		Book c = b;
//		System.out.println(b.hashCode());
//		System.out.println(c.author);
		
//		List<String> names = new ArrayList<>();
//		Scanner s = new Scanner(System.in);
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Enter your name: ");
//			String name = s.nextLine();
//			names.add(name);
//		}
	}

}






