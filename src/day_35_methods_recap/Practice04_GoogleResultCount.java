package day_35_methods_recap;

public class Practice04_GoogleResultCount {

	public static void main(String[] args) {

		String results = "About 1,060,000,000 results (0.74 seconds) ";
		
		System.out.println(resultCount(results));
	}
	
	public static String resultCount(String str) {
		
		String [] strSplit = str.split(" ");
		//About, 1,060,000,000, results, (0.74 seconds)
		//1,060,000,000
		String resultWithComma = strSplit[1];
		
		String resultWithOutComma = strSplit[1].replaceAll(",", "");
		
		return resultWithOutComma;
	}
	

}
