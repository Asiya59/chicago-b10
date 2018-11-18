package day_45_inheritance;

public class Student {

	String name;
	int age;
	String location;
	
	public void study(String course) {
		System.out.println("Studying course: " + course);
	}
	
	public boolean takeExam(int point) {
		if(point >= 80) {
			return true;
		}
		else {
			return false;
		}
	}
}
