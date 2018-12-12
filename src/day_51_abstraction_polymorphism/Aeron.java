package day_51_abstraction_polymorphism;

public class Aeron extends Chair implements Rollable{

	@Override
	public void sit() {
		System.out.println("Sitting on Aeron Chair");
	}
	
	@Override
	public void stepOnIt() {
		System.out.println("Stepping on Aeron Chair");
	}

	@Override
	public void rollForward() {
		System.out.println("Aeron Chair is rolling forward");
	}

	@Override
	public void rollBack() {
		System.out.println("Aeron Chair is rolling backwards");
	}
	
}
