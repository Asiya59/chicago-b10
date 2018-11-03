package day_40_classes_objects;

public class Dog {
	
	String breed;
	int size;
	int age;
	
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void sit() {
		System.out.println("Dog is sitting");
	}
	
	public void eat(String food) {
		System.out.println("Dog is eating " + food);
	}

}
