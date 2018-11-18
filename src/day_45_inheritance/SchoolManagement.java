package day_45_inheritance;

public class SchoolManagement {

	public static void main(String[] args) {
//		School s = new School();
//		School s2 = new School("Cybertek", "Chicago, IL");
//		s.addCourse("Java");
//		s.addCourse("Javascript");
//		System.out.println(s.getCourses());
//		s2.addCourse("Java - 2");
//		s2.addCourse("Javascript - 2");
//		System.out.println(s2.getCourses());
		CodingBootcamp cb = new CodingBootcamp();
		cb.hostEvent("December 31");
		OnlineStudent os = new OnlineStudent();
		os.batchID = 10;
		os.name = "Kader";
		os.takeExam(70);
		Student s = new Student();
		
	}
}



