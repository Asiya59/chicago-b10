package day_44_statics;

import java.util.Random;

public class Post {
	
	private String body;
	private String date;
	private int likes;
	private int postID;
	
	public Post() {
		Random r = new Random();
		postID = r.nextInt(3000);
	}
	
	public void postInfo() {
		System.out.println("Body: " + body);
		System.out.println("Date: " + date);
		System.out.println("Likes: " + likes);
	}
	
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public void setPostID(int postID) {
		this.postID = postID;
	}
	
	
	

}










