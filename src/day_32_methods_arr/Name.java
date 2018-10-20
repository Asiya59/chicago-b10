package day_32_methods_arr;

import java.util.Arrays;

public class Name {
	public static void main(String[] args) {
		
		String [] names = {"James Bond"," Obama", "Donald Trump Junior", "Adam Smith", "John Wick"};
		
		String [] myNames = twoAndMoreWords(names);
		System.out.println(Arrays.toString(myNames));
	}
	
	
//	Pseudo code
//	Create a method that takes/accepts String array
//	And Returns String array
//	Logic: method should find an element that consist of two or more words and return that
//	input: ["James Bond", "Adam", "John Wick", "Elize"]
//	output: ["James Bond", "John Wick"]
	
	public static String[] twoAndMoreWords(String[] nameList) {
		int count = 0;
		
		for(String name: nameList) {
			name = name.trim();
			if(name.contains(" ")) {
//				System.out.println(name);
				count++;
			}
		}
		
		String [] newArray = new String [count];
//		System.out.println("Count: " + count);
		int index = 0;
		for(int i =0; i < nameList.length; i++) {
			String name1 = nameList[i].trim();
//			System.out.println(name1);
			if(name1.contains(" ")) {
				newArray[index] = name1;
				index++;
			}
		}
		return newArray;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 "James Bond"
//	  Flow:
//	 1. count the elements that has two or more words
//	 2. Create array of Strings with the 'count' size
//	 3. Iterate through each element again and set elements with two or more words to newly created array
	public static String[] getNamesWithLastNames(String [] names) {
		int count = 0;
		for(String name: names) {
//			name.contains(" ");
			System.out.println(name);
			name = name.trim();
			int numOfWords = name.split(" ").length;
			if(numOfWords > 1) {
				count++;
			}
		}
		String [] result = new String[count];
		int index = 0;
		for(String name: names) {
//			name.contains(" "); -> other approach
			name = name.trim();
			int numOfWords = name.split(" ").length;
			if(numOfWords > 1) {
				result[index] = name;
				index++;
			}
		}
		return result;
	}
}




