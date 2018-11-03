package day_39_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class ObjectExamples {
	
	public static void main(String[] args) {
		
		Iphone myPhone = new Iphone();
		myPhone.model = "IPhone 8 Plus";
		myPhone.memory = 64;
		myPhone.color = "Silver";
		
		
		Iphone kamilsPhone = new Iphone();
//		System.out.println(kamilsPhone.model);
		kamilsPhone.model = "Iphone XS max";
		kamilsPhone.memory = 128;
		kamilsPhone.color = "Gold";
		
//		System.out.println(kamilsPhone.model);
//		System.out.println(myPhone.model);
		
//		kamilsPhone.printPhoneInfo();
//		System.out.println();
//		myPhone.printPhoneInfo();
		
		List<Iphone> phones = new ArrayList<>();
		phones.add(myPhone);
		phones.add(kamilsPhone);
		
		for(Iphone i: phones) {
			System.out.println(i.model);
		}
	}

}











