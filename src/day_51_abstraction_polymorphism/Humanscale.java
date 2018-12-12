package day_51_abstraction_polymorphism;

public class Humanscale extends Chair implements Rollable, Collapsible{

	
	
	
	@Override
	public void stepOnIt() {
		System.out.println("Stepping on Humanscale Chair");
	}

	@Override
	public void lock() {
		System.out.println("Humanscale chair is locked");
	}

	@Override
	public void unlock() {
		System.out.println("Humanscale chair is unlocked");
	}

	@Override
	public void fold() {
		System.out.println("Humanscale chair is folded");
	}

	@Override
	public void unfold() {
		System.out.println("Humanscale chair is unfolded");

	}

	@Override
	public void rollForward() {
		System.out.println("Humanscale chair is rolling forward");
	}

	@Override
	public void rollBack() {
		System.out.println("Humanscale chair is rolling backwards");
	}
	
}
