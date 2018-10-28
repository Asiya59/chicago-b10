package day_35_methods_recap;

public class Practice03_Palindromes {

	public static void main(String[] args) {

		String name2= "civic234234";
		System.out.println(isPalindrome(name2));
	}

	public static boolean isPalindrome(String name) {
		String str = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			str += name.charAt(i);
			//str = str + name.charAt(i);
		}
		
		if(!str.equals(name)) {
			return false;
		}else
			return true;
		
		
	}
}
