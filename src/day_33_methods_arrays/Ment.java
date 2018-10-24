package day_33_methods_arrays;

public class Ment {
	
	public static void main(String[] args) {
		cut("Oboma", 2);
	}
	
	public static void cut(String word, int indexFrom) {
		String s = word.substring(indexFrom);
		System.out.println(s);
	}

}
