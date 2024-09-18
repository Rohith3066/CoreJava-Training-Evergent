package com.evergent.corejava.caseStudy;

import java.util.Scanner;

public class LibraryInterfaceDemo {
	static {
		System.out.println("**WELCOME TO  ROHITH'S LIBRARY**");
	}
	public static void main(String[] args) {
		
		System.out.println("username:rohithgondela password:gondela after you viewing this username and password remove this line");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your username");
		String username=sc.nextLine();
		System.out.println("enter your password");
		String password=sc.nextLine();
		
		try {
			new LoginDetails(username,password);
			System.out.println("You are successfully logged in...!");
			System.out.println("enter your age");
		} catch (InvalidLoginDetailsException e) {
			System.out.println("LoginError :"+e.getMessage());
			System.out.println(e);
		}
	   
		
		int age=sc.nextInt();
		System.out.println("enter your booktype");
		String bookType=sc.next();
		try {
			new KidUsers(age, bookType);
		   
		} catch (InvalidAgeException|InvalidBookTypeException e) {
			System.out.println("kidUsersException :"+e.getMessage());
			System.out.println(e);
		}
		try {
			 new AdultUser(age, bookType);
		} catch (InvalidAgeException|InvalidBookTypeException e) {
			System.out.println("childUsersException :"+e.getMessage());
		}
		
	}

}
