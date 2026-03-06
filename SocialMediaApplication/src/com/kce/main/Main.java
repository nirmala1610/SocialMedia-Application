package com.kce.main;

import java.util.List;
import java.util.Scanner;

import com.kce.entity.Post;
import com.kce.entity.User;
import com.kce.service.SocialMediaAppService;

public class Main {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    SocialMediaAppService service = new SocialMediaAppService();

    while (true) {

        System.out.println("\n===== SOCIAL MEDIA APP =====");
        System.out.println("1. Signup");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                service.signup();
                break;

            case 2:
                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                User currentUser = null;

                for (User u : service.users) {
                    if (u.getName().equalsIgnoreCase(name)) {
                        currentUser = u;
                        break;
                    }
                }

                if (currentUser == null) {
                    System.out.println("User not found!");
                } else {
                    userMenu(service, currentUser, sc);
                }
                break;

            case 3:
                System.out.println("Exiting application...");
                sc.close();
                return;
        }
    }
}

public static void userMenu(SocialMediaAppService service, User user, Scanner sc) {

    while (true) {

        System.out.println("\n===== Welcome " + user.getName() + " =====");
        System.out.println("1. Suggest Friends");
        System.out.println("2. Send Friend Request");
        System.out.println("3. Accept Friend Requests");
        System.out.println("4. Create Post");
        System.out.println("5. View Feed");
        System.out.println("6. Like Post");
        System.out.println("7. Comment Post");
        System.out.println("8. View Notifications");
        System.out.println("9. Logout");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                service.suggestFriends(user);
                break;

            case 2:
                System.out.print("Enter user name to send request: ");
                String receiverName = sc.nextLine();

                for (User u : service.users) {
                    if (u.getName().equalsIgnoreCase(receiverName)) {
                        service.sendFriendRequest(user, u);
                        System.out.println("Friend request sent!");
                    }
                }
                break;

            case 3:
                List<User> requests = user.getReceiveRequset();

                if (requests.isEmpty()) {
                    System.out.println("No pending requests.");
                } else {
                    for (User r : requests) {
                        System.out.println("Request from: " + r.getName());
                        System.out.println("Accept? (yes/no)");
                        String ans = sc.nextLine();

                        if (ans.equalsIgnoreCase("yes")) {
                            service.acceptRequset(user, r);
                            System.out.println("Friend request accepted.");
                            break;
                        }
                    }
                }
                break;

            case 4:
                System.out.print("Enter post content: ");
                String content = sc.nextLine();
                service.createPost(user, content);
                System.out.println("Post created!");
                break;

            case 5:
                service.showFeed(user);
                break;

            case 6:
                System.out.println("Select friend post to like:");

                for (User f : user.getFriends()) {
                    for (Post p : f.getPosts()) {
                        System.out.println("Post: " + p.getContent());
                        System.out.println("By: " + f.getName());
                        service.likePost(user, p);
                        System.out.println("Post liked!");
                        return;
                    }
                }
                break;

            case 7:
                System.out.println("Select friend post to comment:");

                for (User f : user.getFriends()) {
                    for (Post p : f.getPosts()) {

                        System.out.println("Post: " + p.getContent());
                        System.out.print("Enter comment: ");
                        String comment = sc.nextLine();

                        service.commentPost(user, p, comment);
                        System.out.println("Comment added!");
                        return;
                    }
                }
                break;

            case 8:
                service.showNotifications(user);
                break;

            case 9:
                System.out.println("Logging out...");
                return;
        }
    }
}
}
