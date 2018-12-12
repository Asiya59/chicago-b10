package mondayMentoringSessions;

import java.util.HashMap;

public class CountCharactersInString {

	/*Write a method that will count all characters in your name*/
	public static HashMap<Character, Integer> countChars(String s) {
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		
		System.out.println(charMap);
		return charMap;
	}
	
	public static void main(String[] args) {
	
		int[] intAr = {1,2,1,2,3,2,3,4,3,4};
		HashMap<Integer, Integer> intMap = countIntsInArray(intAr);
		for(int i : intMap.keySet()) {
			System.out.println("Integer "+ i + " number of occurences "+ intMap.get(i));
		}

		
	}

	private static HashMap<Integer, Integer> countIntsInArray(int[] intAr) {
		HashMap<Integer, Integer> intMap = new HashMap<>();
		
	
		for(int i = 0; i < intAr.length; i++) {
			int number = intAr[i];
			if(intMap.containsKey(number)) {
				intMap.put(number, intMap.get(number)+1);
			}else {
				intMap.put(number, 1);
			}
		}
		
		return intMap;
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		return countChars(s1).equals(countChars(s2));
	}
}
