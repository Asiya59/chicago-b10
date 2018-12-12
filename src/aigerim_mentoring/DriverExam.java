package aigerim_mentoring;

public class DriverExam {
	//create instance variables
private String[] correctAnswers = {"A", "B", "C", "D",
								  "A", "B", "C", "D",
								  "A", "B", "C", "D",
								  "A","B", "C", "D",
								  "A", "B", "C", "D"};
private String[] studentAnswers;
private int numOfQuestions = correctAnswers.length;

//create instance method:
// 1 totalCorrect      2.totalIncorrect    3  passed

public int  totalCorrect() {
	int totalCorrectAnswers = 0;
	for (int i = 0; i < numOfQuestions; i++) {
		if(correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {
			totalCorrectAnswers = totalCorrectAnswers +1;
		}
	}
	return totalCorrectAnswers;
}
public int  totalIncorrect() {
	int totalIncorrectAnswers = 0;
	for (int i = 0; i < numOfQuestions; i++) {
		if(!(correctAnswers[i].equalsIgnoreCase(studentAnswers[i]))) {
			totalIncorrectAnswers = totalIncorrectAnswers +1;
		}
	}
	return totalIncorrectAnswers;
}
public boolean passed() {
	int passingScore = 15;
	if(totalCorrect() >= passingScore) {
		return true;
	}
	return false;
}

public DriverExam(String[] studentGivenArr) {
  studentAnswers = studentGivenArr;
}




}

