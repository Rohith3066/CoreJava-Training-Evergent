package com.evergent.corejava.oops;

public class EncapPersonDetails {
	String name = "Rohith";
	int age = 22;
	String address ="Hyderabad";
	public void personData(){
		
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Address :"+address);
	}

	public static void main(String[] args) {
		
		EncapPersonDetails e = new EncapPersonDetails();
		e.personData();
	}

}
