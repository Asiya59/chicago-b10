package day_44_statics;

public class Whatsapp {
	
	public static void main(String[] args) {
//		String name = "Adam";
//		CustomData.generateUsername(name);
//		CustomData.generatePassword(name);
		Post p1 = new Post();
		System.out.println(p1.getPostID());
		p1.setBody("Today is a good day!!!");
		p1.setDate("November 11, 2018");
		p1.postInfo();
		FacebookUser user1 = new FacebookUser("jamie32", "123");
		user1.post(p1);
		System.out.println(user1.posts.get(0).getBody());
	}

}
