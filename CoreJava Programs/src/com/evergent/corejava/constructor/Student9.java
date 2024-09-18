package com.evergent.corejava.constructor;
//copy constructor
public class Student9 {
	String name;
	int age;
	public Student9(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void displayInfo() {
		System.out.println("Student Name is:"+name);
		System.out.println("Student age is:"+age);
	}
	public static void main(String[] args) {
		Student9 s1= new Student9("Rohith",20);
		Student9 s2 = new Student9(s1);
		s1.displayInfo();
		s2.displayInfo();
	}
}
