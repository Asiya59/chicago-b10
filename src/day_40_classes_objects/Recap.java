package day_40_classes_objects;

public class Recap {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Chow chow";
		dog1.size = 5;
		dog1.age = 2;
		
		dog1.eat();
		System.out.println(dog1.age);
		System.out.println(dog1.breed);
		dog1.eat("plov");
	}

}
