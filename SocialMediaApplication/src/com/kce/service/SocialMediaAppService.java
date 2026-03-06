package com.kce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kce.entity.Notification;
import com.kce.entity.Post;
import com.kce.entity.User;

public class SocialMediaAppService {

	public List<User> users = new ArrayList<User>();
	
	public void signup() {
		Scanner sc = new Scanner(System.in);
		
		User user=new User();
		
		System.out.println("Enter Name:");
		user.setName(sc.nextLine());
		
		System.out.println("Enter Age:");
		user.setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter DOB:");
		user.setDob(sc.nextLine());
		
		System.out.println("Enter Location:");
		user.setLocation(sc.nextLine());
		
		System.out.println("Enter Occupation:");
		user.setOccupation(sc.nextLine());
		
		users.add(user);
		
		System.out.println("User Created successsfullky!");	

	}
	
	public void suggestFriends(User currentUser) {
		for(User u : users) {
			if(u==currentUser)
				continue;
			if(currentUser.getFriends().contains(u))
				continue;
			
			int score = 0;
			
			if(u.getName().equals(currentUser.getName()))
				score++;
			if(u.getAge()==currentUser.getAge())
				score++;
			if(u.getLocation().equals(currentUser.getLocation()))
				score++;
			
			if(score>0) {
				System.out.println(u.getName()+" match Score: "+score);
			}
		}
	}
	
	public void sendFriendRequest(User sender,User receiver) {
		receiver.getReceiveRequset().add(sender);
		sender.getSendRequests().add(receiver);
		
		Notification n = new Notification(sender.getName() + " sent you a friend request");
	    receiver.getNotifications().add(n);
	}
	
	public void acceptRequset(User currentUser,User requester) {
		currentUser.getFriends().add(requester);
		requester.getFriends().add(currentUser);
		
		currentUser.getReceiveRequset().remove(requester);
		
		 Notification n = new Notification(currentUser.getName() + " accepted your friend request");
	    requester.getNotifications().add(n);
;		
	}
	
	public void createPost(User user,String content) {
		
		Post post = new Post();
		post.setContent(content);
		post.setAuthor(user);
		user.getPosts().add(post);
	}
	
	public void showFeed(User user) {
		for(User friend: user.getFriends()) {
			for(Post p: friend.getPosts()) {
				System.out.println("Author : " + p.getAuthor());
				System.out.println("Post : " + p.getContent());
				System.out.println("Likes : "+ p.getLikes());
				System.out.println("Comments : " + p.getComment());
				System.out.println("----------------");
			}
		}
	}
	
	public void likePost(User user,Post post) {
		if(!post.getLikes().contains(user)) {
			post.getLikes().add(user);
			
			Notification n = new Notification(user.getName() + " liked your post");
	        post.getAuthor().getNotifications().add(n);
		}
	}
	
	public void commentPost(User user,Post post,String comment) {
		post.getComment().add(user.getName()+":" + comment);
		
		Notification n = new Notification(user.getName() + " commented on your post");
	    post.getAuthor().getNotifications().add(n);
	}
	
	public void showNotifications(User user) {
		for(Notification n:user.getNotifications()) {
			System.out.println(n.getMessage());
		}
		
		user.getNotifications().clear();
	}
}
