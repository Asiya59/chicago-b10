package aigerim_mentoring;

import java.util.Scanner;

public class DriverExamTest {
	public static void main(String[] args) {
		int num_of_questions = 20;
		String[] studentAnswers = new String[num_of_questions];
		fillStudentAnswerArr(studentAnswers);
		DriverExam drivingTest = new DriverExam(studentAnswers);
		showResult(drivingTest);
	}
 
	public static void fillStudentAnswerArr(String[] studentAnswers) {
		//createva scanner
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < studentAnswers.length; i++) {
		System.out.println("Answer for question" + (i+1));
		String userResponse = scan.nextLine();
		while(! userResponse.equalsIgnoreCase("A") && userResponse.equalsIgnoreCase("B") &&
		userResponse.equalsIgnoreCase("C") && userResponse.equalsIgnoreCase("D"));
		
		
		studentAnswers[i]= userResponse;
	}
}

public static void showResult(DriverExam driverExamObject) {
	
	System.out.println("You got " + driverExamObject.totalCorrect() + 
		" correct answers and " + driverExamObject.totalIncorrect() + "incorrect answers");
	if(driverExamObject.passed()) {
		System.out.println("\n You PASSED");
		
		
	}else {
		System.out.println("\n You failed");
	}
	
}
}
	
	
