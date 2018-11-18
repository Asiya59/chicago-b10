package talgatMentoring;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private int tuitionBalance;
	private String email;
	private String studentId;
	private int pricePerCourse = 400;
	private static String domain = "@cybertek.com";
	private static int id = 1000;
	private ArrayList<String> listOfCourses = new ArrayList <>();
	
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		lastName = in.nextLine();
		
		System.out.print("Enter student grade level: ");
		gradeLevel = in.nextInt();
		
		id++;	
		
		studentId();
	}
	
	public void studentId() {
		studentId = gradeLevel + "" + id;
	}
	
	public void enroll() {
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter courses to enroll: ");
			String course = scan.nextLine();
			
			if(!course.equals("q")) {
				listOfCourses.add(course);
				tuitionBalance = tuitionBalance + pricePerCourse;
			}
			else {
				break;
			}
		} while( 1 != 0);
		
		System.out.println("Enrolled courses: ");
		System.out.println(listOfCourses);
		System.out.println("Current balance: " + tuitionBalance);
	}
	
	public void payTuition() {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Amount of payment: ");
		int payment = scan1.nextInt();
		tuitionBalance = tuitionBalance - payment;
		
		System.out.println("Thanks for the payment of: " + payment);
		System.out.println("Current balance: " + tuitionBalance);
		System.out.println("Receipt sent to " + setEmail());
	}
	
	public String setEmail() {
		
		email = firstName+"."+lastName+domain.toLowerCase();
		return email.toLowerCase();
	}
	
	public void studentInfo() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Grade level: " + gradeLevel);
		System.out.println("Student ID: " + studentId);
		System.out.println("Courses enrolled: " + listOfCourses);
		System.out.println("Email: " + setEmail());
		
	}

}
