# Social Media Console Application

## Project Description

This project is a **console-based Social Media Application** developed using **Java and Collections Framework**.
The system simulates the basic features of a social media platform such as user signup, friend requests, posts, likes, comments, and notifications.

The application runs entirely in the console and stores data using Java collections like **ArrayList** and **List**, without using any database.

---

## Features

### 1. User Management

Users can register by providing the following details:

* Name
* Age
* Date of Birth (DOB)
* Location
* Occupation

After signup, users can login using their name.

---

### 2. Friend Suggestions

The system suggests potential friends based on:

* Same Name
* Same Age
* Same Location

Users with matching attributes receive a **match score**.

---

### 3. Friend Request Management

Users can send friend requests to other users.

Functions included:

* Send Friend Request
* Receive Friend Request Notification
* Accept Friend Request
* Automatically update friend lists

---

### 4. View Friends

Users can view their list of friends along with their profile information.

---

### 5. Create Post

Users can create posts that are visible to their friends.

Example:
Enjoying the sunny day in New York! #blessed

---

### 6. News Feed

Users can view posts created by their friends.

Each post displays:

* Author name
* Post content
* Number of likes
* Comments

Newest posts appear first in the feed.

---

### 7. Post Interaction

Users can interact with posts by:

* Liking a post
* Commenting on a post

Example comment:
Looks amazing!

---

### 8. Notifications

Users receive notifications for:

* Friend Requests
* Accepted Friend Requests
* Likes on their posts
* Comments on their posts

Notifications are cleared after viewing.

---

## Technologies Used

* Java
* Java Collections Framework
* Object-Oriented Programming (OOP)

---

## Project Structure

com.kce.entity
• User.java
• Post.java
• Notification.java

com.kce.service
• SocialMediaAppService.java

com.kce.main
• Main.java

---

## How to Run the Project

1. Open the project in **Eclipse or any Java IDE**
2. Compile the project
3. Run the **Main.java** file
4. Use the console menu to interact with the application

---

## Example Workflow

1. User **Alice** signs up.
2. User **Bob** signs up.
3. Alice sends a friend request to Bob.
4. Bob receives a notification and accepts the request.
5. Alice creates a post.
6. Bob sees Alice’s post in his feed.
7. Bob likes and comments on the post.
8. Alice receives notifications for the like and comment.

---

## Screenshots

<img width="956" height="472" alt="image" src="https://github.com/user-attachments/assets/65d2e5de-c496-4eaa-bf5d-174415ed6812" />

<img width="966" height="549" alt="image" src="https://github.com/user-attachments/assets/4939b7a2-f0f6-4c97-824d-bcc8c6126f01" />

<img width="943" height="322" alt="image" src="https://github.com/user-attachments/assets/8b39860d-25c6-48cf-87a2-1481e000d5c4" />


---

## Conclusion

This project demonstrates the implementation of a simple social media system using **Java collections and object-oriented programming concepts**. It provides a basic understanding of how social networking platforms manage users, posts, friendships, and notifications.

---
