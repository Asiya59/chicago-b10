package day_35_methods_recap;

import java.util.Arrays;

public class Practice07_isAnagram {

	public static void main(String[] args) {
		String firstWord = "march";
		String secondWord = "charmfas";
		
		System.out.println(isAnagram(firstWord, secondWord));
	}
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length()!= str2.length()) {
			return false;
		}
		
		char [] char1= str1.toCharArray(); //['m','a','r','c','h']
		char [] char2 = str2.toCharArray(); // ['c','h','a','r','m']
		//char [][] twoDimArr = {str1.toCharArray(),str2.toCharArray()};
		Arrays.sort(char1); //[a,c,m,r,h]
		Arrays.sort(char2);	//[a,c,m,r,h]
		
		for(int i=0; i<str1.length(); i++) {
			if(char1[i] != char2[i]) {
				return false;
			}
		}
		
		return true;
		
		
	}

}
