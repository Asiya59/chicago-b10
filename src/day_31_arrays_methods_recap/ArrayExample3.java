package day_31_arrays_methods_recap;

public class ArrayExample3 {

	public static void main(String[] args) {
		
		int [] grades = {500,1,24,1,500,441,233,122,333};
		
		int minGrade = 999;
		int maxGrade = 0;
		
		for(int i=0; i<grades.length; i++) {
			
			if(maxGrade < grades[i]) {
				maxGrade = grades[i];
			}
			
			if(minGrade > grades[i]) {
				minGrade = grades[i];
			}
			
		}
		
		System.out.println("Minimum grade: " + minGrade );
		System.out.println("Maximum grade: " + maxGrade );
	}

}
