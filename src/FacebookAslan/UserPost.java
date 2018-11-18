package FacebookAslan;

import java.util.Random;

public class UserPost {
	private String text;
	private int likes;
	private int postID;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getPostID() {
		return postID;
	}
	public void setPostID() {
		Random r = new Random();
		this.postID = r.nextInt(3000);
	}
	
	public void postInfo() {
		System.out.println("Text: " + this.text);
		System.out.println(this.likes + " total likes.");
	}
	
	
	
}
