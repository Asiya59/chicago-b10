package day_45_inheritance;

import java.util.ArrayList;
import java.util.List;

public class School {

	private String name;
	private List<String> courses;
	private int totalStudents;
	private String location;
	
	
	public School(String name, String location) {
		this.name = name;
		this.location = location;
		courses = new ArrayList<>();
	}
	
	public School() {
		courses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		if(totalStudents < 0) {
			System.out.println("Invalid total students data");
		}
		else {
			this.totalStudents = totalStudents;
		}
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void teach() {
		System.out.println("teaching");
	}
	
	public void teach(String course) {
		System.out.println("teaching course: " + course);
	}
	
	public void addCourse(String course) {
		courses.add(course);
	}
	
	
	
}













