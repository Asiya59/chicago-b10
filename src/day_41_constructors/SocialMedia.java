package day_41_constructors;

public class SocialMedia {
	
	public static void main(String[] args) {
		FacebookUser user1 = new FacebookUser("james2018", "123");
		user1.numOfFriends = 4000;
		FacebookUser user2 = new FacebookUser("adam", "adam123");
		user2.age = 32;
		user2.name = "Adam Smith";
		user2.numOfFriends = 300;
		System.out.println(user2.age);
		System.out.println(user2.numOfFriends);

		FacebookUser user3 = new FacebookUser("john", "john123", "John Doe");
		System.out.println(user3.password);
		
		boolean check = user3.sendFriendRequest(user1);
		System.out.println(check);
		System.out.println("---------");
		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
	}

}
