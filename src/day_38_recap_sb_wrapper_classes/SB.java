package day_38_recap_sb_wrapper_classes;

public class SB {

	public static void main(String[] args) {
//		Immutable --> aka NOT changeable
//		not changeable for original value
		String s = "James";
		System.out.println(s.hashCode());
		System.out.println("Initial value: " + s);
//		s = s.substring(1, 3);
		System.out.println("After value: " + s);
		System.out.println(s.hashCode());
		String s2 = "James";
		System.out.println(s2.hashCode() == s.hashCode());
		System.out.println(s == s2);
		
//		--------------------------------------------
//		MUTABLE 
//		StringBuilder -- Mutable version of String.
//		Its original value is changeable.
//		
		System.out.println("----MUTABLE EXAMPLES---\n");
		StringBuilder sb = new StringBuilder("James");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(" Bond");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.reverse();
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		sb.insert(2, "HELLO");
		System.out.println(sb);
		String str = "Adam";
		StringBuilder str2 = new StringBuilder(str);
		str2.reverse();
		System.out.println(str2);
		str = str2.toString();
		System.out.println(str);
	}
}


































