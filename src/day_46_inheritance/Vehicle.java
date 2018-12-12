package day_46_inheritance;

public class Vehicle {

	String type;
	String color;
	int year;
	boolean isNew;
	
	public Vehicle(String color) {
		this.color = color;
	}
	
	
	public void startEngine() {
		System.out.println("Engine is starting");
	}
	public void stopEngine() {
		System.out.println("Engine is stopping");
	}
	
	public static void fixVehicle(String date) {
		System.out.println("Vegicle is getting fixed on " + date);
	}
}
