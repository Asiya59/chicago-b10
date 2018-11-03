package day_40_classes_objects;

public class Computer {

	String model;
	int memory;
	int size;
	String color;
	boolean isNew;
	
	public void turnOn() {
		System.out.println("Computer turning on");
	}
	
	public void turnOff() {
		System.out.println(model + " is turning off");
	}
	
}
