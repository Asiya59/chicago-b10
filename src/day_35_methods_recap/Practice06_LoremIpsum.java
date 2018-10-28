package day_35_methods_recap;

public class Practice06_LoremIpsum {

	public static void main(String[] args) {
		
		String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. "
				+ "Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices vitae "
				+ "auctor eu augue.";
		
		System.out.println(doesContain(loremIpsum));

	}
	
	public static boolean doesContain(String str) {
		
		String [] splitIpsum = str.split("\\.");
		
		String thirdSentence = splitIpsum[2];
		
		if(thirdSentence.contains("massa")) {
			return true;
		}else
			return false;		
		
	}
	
	

}
