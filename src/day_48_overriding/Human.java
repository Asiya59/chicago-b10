package day_48_overriding;

import day_45_inheritance.Animal;

public class Human {

	String gender;
	int age;
	
	public static void sleep() {
		System.out.println("Human is sleeping");
	}
	
	void run() {
		System.out.println("Human is running");
	}
	
	public Animal hunt() {
		Animal a = new Animal();
		return a;
	}
	
	public void eat() {
		System.out.println("Human is eating");
	}
}
