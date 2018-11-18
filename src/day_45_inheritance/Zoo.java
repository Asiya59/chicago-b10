package day_45_inheritance;

public class Zoo {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sleep();
		d.name = "Lucky";
		d.age = 5;
		d.eat();
		System.out.println(d.name);
		d.furColor = "Black";
		d.bark();
		ServiceDog sd = new ServiceDog();
		sd.bark();
	}

}






