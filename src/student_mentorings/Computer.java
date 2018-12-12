package student_mentorings;

public abstract class Computer {
	
	public Computer() {
		super();
	}
	
	String type;
	int year;
	int memory;
	String color;
	
	public abstract void charge();
	
	public abstract void turnOn() ;
	
	public abstract void turnOff();
	
	public abstract void calculate();

}
