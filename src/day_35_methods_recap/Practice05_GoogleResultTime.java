package day_35_methods_recap;

public class Practice05_GoogleResultTime {

	public static void main(String[] args) {

		String results = "About 1,060,000,000 results (0.74 seconds) ";
		
		System.out.println(resultTime(results));
	}
	
	public static String resultTime(String str) {
		
		String [] splitArr = str.split("\\(");
		
		String secondPart = splitArr[1]; //0.74 seconds)
		
		String wopSecondPart= secondPart.replace("\\)", "");
		
		return wopSecondPart;
		
		
		
	}

}
