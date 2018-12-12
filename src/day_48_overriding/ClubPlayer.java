package day_48_overriding;

public class ClubPlayer extends SoccerPlayer{
	
	
	
	@Override
	public void eat() {
		System.out.println("Club player is eating");
		super.eat();
		super.name = "aj";
	}
}
