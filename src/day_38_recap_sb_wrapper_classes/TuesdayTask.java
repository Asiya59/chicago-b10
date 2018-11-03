package day_38_recap_sb_wrapper_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TuesdayTask {
	
	public static void main(String[] args) {
//		System.out.println(removeCon("consequences"));
//		System.out.println(removeCon("constant value"));
//		System.out.println(removeCon(" continue"));
//		System.out.println(removeCon("concon"));
//		System.out.println(removeCon("co"));
		System.out.println(removeCon("Pineapple", "Apple"));
		System.out.println(removeCon("Hello word", "word"));
		System.out.println(removeCon("consequences ", "que"));
		System.out.println("---- TASK 3 -----\n");
		System.out.println(getRandomNumList(7, 50));
		System.out.println(getRandomNumList(5, 20));
		System.out.println(getRandomNumList(3, 30));
		int [] n = {3,2};
		
	}
	
	public static String removeCon(String word) {
		word = word.toLowerCase().trim();
		if(word.contains(" ")) {
			System.out.println("Invalid data");
			return "";
		}
		
		else if(word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		else if(word.contains("con")) {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(word.indexOf("con"), word.indexOf("con")+3);
			return sb.toString();
		}
		else {
			return word;
		}
	}
	
	public static String removeCon(String word, String target) {
		word = word.trim().toLowerCase();
		target = target.trim().toLowerCase();
		if(word.contains(" ")) {
			System.out.println("Invalid data");
			return "";
		}
		else if(word.length() < target.length()) {
			System.out.println("Invalid data");
			return "";
		}
		else if(word.contains(target)) {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(word.indexOf(target), word.indexOf(target) + target.length());
			return sb.toString();
		}
		else {
			return word;
		}
	}
	
	public static List<Integer> getRandomNumList(int size, int bound){
		Random random = new Random();
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			nums.add(random.nextInt(bound));
		}
		return nums;
	}
	
	
	
	
	

}











