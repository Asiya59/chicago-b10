package day_44_statics;

import java.util.Random;

public class CustomData {
	
	public static void main(String[] args) {
		String s = generateUsername(" bond");
		System.out.println(s);
		String s2 = generatePassword("Adam Smith");
		System.out.println(s2);
	}
	
	public static String generateUsername(String word) {
//		String [] words = word.split(" ");
//		String result = "";
//		if(words.length > 1) {
//			for(String s: words) {
//				result += s;
//			}
//		}
		word = word.replace(" ", "");
		Random r = new Random();
		word = word + r.nextInt(100);
		return word.toLowerCase();
	}
	
	public static String generatePassword(String word) {
		word = word.replace(" ", "");
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();
		Random r = new Random();
		sb.append(r.nextInt(500));
		return sb.toString().toLowerCase();
	}

}
























