package com.evergent.corejava.caseStudy;
public class KidUsers implements LibraryUser {
private int age;
private String bookType;
public KidUsers(int age,String bookType) throws InvalidAgeException,InvalidBookTypeException{
	if(verifyAge(age)==true){
		this.age=age;
		System.out.println("You have successfully registered under a Kids Account");
		
		if (verifyBookType(bookType)==true ) {
			this.bookType=bookType;
			System.out.println("Book Issued successfully, please return the book within 10 days");
			
		}
		else {
			 throw new InvalidBookTypeException("Oops, you are allowed to take only kids books");
			
		}
		
	
	}
	else  throw new InvalidAgeException("Sorry, Age must be less than 12 to register as a kid");
}
private final boolean verifyAge(int age) {
	if(age<12) {
		return true;
	}
	else return false;
}
private final boolean verifyBookType(String bookType) {
	if(bookType.equals("kids")) {
		if(age<12) {
			return true;
		}
		else return false;
	}
	else return false;
}
@Override
public void registerAccount(int age) throws InvalidAgeException {
	// TODO Auto-generated method stub
	
}
@Override
public void requestBook(String bookType) throws InvalidBookTypeException {
	// TODO Auto-generated method stub
	
}
}

