package com.kce.entity;

import java.util.ArrayList;
import java.util.List;

public class Post {

	private String content;
	private User author;
	
	List<User> likes = new ArrayList<User>();
	List<String> comment = new ArrayList<String>();
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public List<User> getLikes() {
		return likes;
	}
	public void setLikes(List<User> likes) {
		this.likes = likes;
	}
	public List<String> getComment() {
		return comment;
	}
	public void setComment(List<String> comment) {
		this.comment = comment;
	}
	
}
