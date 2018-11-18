package FacebookAslan;

public class OurFacebook {
	public static void main(String[] args) {
		
		FakebookUser olya = new FakebookUser("Olga", "volga", "123");
		
		FakebookUser uran = new FakebookUser("Uran", "buranos", "312");
		
		FakebookUser alex = new FakebookUser("Asel", "alexa", "789");
		
		uran.age = 25;
		
		olya.sendFriendRequest(uran);
		
		alex.sendFriendRequest(uran);
		
		uran.acceptRequests();
		
		System.out.println("Number of friend requests: " + uran.friendRequests.size());
		System.out.println("Number of friends: " + uran.friends.size());
	}
}
