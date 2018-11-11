package day_43_objects_constructors_recap;

public class Student {
	
	String firstName;
	String lastName;
	int studentCount;
	
	public Student(String fn, String ln) {
		
		firstName = fn;
		lastName = ln;
		studentCount++;
		
		System.out.println("Added student: " + fn + " " + ln);
		System.out.println("Number of students: " + studentCount);
		
		
	}

}
