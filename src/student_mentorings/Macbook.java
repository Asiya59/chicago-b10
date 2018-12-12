package student_mentorings;

public class Macbook extends Computer{
	
	public Macbook() {
		super();
	}
	
	@Override
	public void charge() {
		System.out.println("Macbook is charging");
	}
	
	@Override
	public void turnOn() {
		System.out.println("Macbook is turning on");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Macbook is turning off");
	}
	
	@Override
	public void calculate() {
		System.out.println("Macbook is calculating");
	}

//	Concrete class - direct regular child class that extends to abstract class. 
//	Responsibility: MUST implement/override all the abstract methods that is 
//	inherited from abstract	class.
 

}
