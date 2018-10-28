package day_37_wrapper_classes;

public class SB {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("James");
		System.out.println(sb.hashCode());
		sb.append(" Bond");
		System.out.println(sb);
//		System.out.println(sb.hashCode());
//		System.out.println(sb.reverse());
//		sb.insert(1, "HELLO");
		
		System.out.println(sb);
		String cut = sb.substring(2);
		System.out.println(cut);
		System.out.println(sb);
		StringBuilder ssb = new StringBuilder(cut);
		String str = ssb.toString();
		
//		String s = "James";
//		System.out.println(s.hashCode());
//		s = s + " Bond";
//		System.out.println(s);
//		System.out.println(s.hashCode());
	}

}






