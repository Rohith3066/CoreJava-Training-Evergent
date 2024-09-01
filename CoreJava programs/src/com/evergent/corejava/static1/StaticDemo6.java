package com.evergent.corejava.static1;
public class StaticDemo6 {
	static String name="Rohith";
	int age=28;
	String address="Hyderabad";
	 public void display() {
		name = "welcome";
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	
	public static void main(String[] args) {
		StaticDemo6 s = new StaticDemo6();
		System.out.println(s.name);
		s.display();
		StaticDemo6 s2 = new StaticDemo6();
		System.out.println(s2.name);
		
	}
}
