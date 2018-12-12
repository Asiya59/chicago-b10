package mondayMentoringSessions;

import java.util.HashMap;
import java.util.Map;

public class Polindrome {
	public static void main(String[] args) {
		test();
		//System.out.println(isPalindrome(33488433));
		
	}
	public static boolean isPalindrome(int num){
		int reverseNum = 0;
		int copyNum = num;
		System.out.println("num is "+num + " & reverseNum is "+reverseNum);

		do{
			reverseNum += num % 10;
			num/=10;
			if(num!=0) {
				reverseNum*=10;
			}
			System.out.println("num is "+num + " & reverseNum is "+reverseNum);
		}while(num!=0);

		if(copyNum == reverseNum){
			return true;
		}else{
			return false;
		}
	}

	public static void test() {
		Map<String, Boolean> map = new HashMap<>();
		map.put("notAPolindrome", false);
		map.put("Civic", true);
		map.put(" Civic", true);
		map.put(null, false);
		map.put("", false);
		map.put("star buttons not tub rats", true);
		map.put("stab nail at ill Italian bats!", false);
		map.put("stab nail at ill Italian bats", true);
		for(String s : map.keySet()) {
			if(isPalindrome(s) == map.get(s)) {
				System.out.println("Test passed for input string: " + s);
			}else {
				System.err.println("Test failed for input string: " + s);
			}
		}		
	}

	public static boolean isPalindrome(String s) {
		String reverseS = "";
		if(s == null || s.isEmpty()) {
			return false;
		}
		s = s.trim().replace(" ", "");
		char[] sArray = s.toCharArray();
		for(int i = sArray.length-1; i >= 0; i--) {
			reverseS += sArray[i]+"";
		}
		return reverseS.equalsIgnoreCase(s);
	}
}
