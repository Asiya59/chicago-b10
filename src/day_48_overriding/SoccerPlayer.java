package day_48_overriding;

import day_45_inheritance.Animal;
import day_45_inheritance.Dog;

public class SoccerPlayer extends Human{
	
	{
		name = "James";
	}

	int jerseyNumber;
	String name;
	
	@Override
	public void run() {
		System.out.println("Soccer player is running");
	}
	
	@Override
	public Dog hunt() {
		return null;
	}
	
	
	public static void sleep() {
		System.out.println();
	}
	
	final public void train() {
		System.out.println("Soccer player is training");
	}
	
	public void bycicleKick() {
		System.out.println("Soccer player is bycicle kicking");
	}
	
}







