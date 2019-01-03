package day_54_exceptions;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals("john")) {
			throw new WallException("Invalid name. John cannot be name");
		}
		this.name = name;
		
	}
	public int getAge() {
		
		return age;
	}
	public void setAge(int age) throws InvalidAgeException {
		if(age < 0 || age > 120) {
			throw new InvalidAgeException();
		}
		this.age = age;
	}
	
	public void eat(String food) throws AppleException {
		if(food.equalsIgnoreCase("apple")) {
			throw new AppleException();
		}
		if(food.equalsIgnoreCase("orange")) {
			throw new OrangeException();
		}
		System.out.println("Person is eating " + food);
	}
	
	

}
