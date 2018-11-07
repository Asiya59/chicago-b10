package day_42_encapsulation_static;

public class Apple {

	private String color;
	int size;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		if(color.equals("whatever")) {
			System.out.println("No color called: " + color);
			this.color = "invalid color entered";
		}else{
			this.color = color;
		}
		
	}
	
	
	
}
