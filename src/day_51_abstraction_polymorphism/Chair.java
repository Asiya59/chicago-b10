package day_51_abstraction_polymorphism;

public abstract class Chair {

	String model;
	int weight;
	
	public void sit() {
		System.out.println("Chair is sitting");
	}
	public abstract void stepOnIt();
	
}
