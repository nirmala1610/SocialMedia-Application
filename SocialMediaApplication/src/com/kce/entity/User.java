package com.kce.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private int age;
	private String dob;
	private String location;
	private String occupation;
	
	List<User> friends = new ArrayList<User>();
	List<User> sendRequests = new ArrayList<User>();
	List<User> receiveRequset = new ArrayList<User>();
	
	List<Post> posts = new ArrayList<Post>();
	List<Notification> notifications = new ArrayList<Notification>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public List<User> getFriends() {
		return friends;
	}
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	public List<User> getSendRequests() {
		return sendRequests;
	}
	public void setSendRequests(List<User> sendRequests) {
		this.sendRequests = sendRequests;
	}
	public List<User> getReceiveRequset() {
		return receiveRequset;
	}
	public void setReceiveRequset(List<User> receiveRequset) {
		this.receiveRequset = receiveRequset;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public List<Notification> getNotifications() {
		return notifications;
	}
	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	
	
}
