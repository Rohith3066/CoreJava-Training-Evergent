package com.evergent.corejava.strings;
final class MyData{
	private final String name;
	private final int age;
	public MyData(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}
}
public class PersonImmutable {

	public static void main(String[] args) {
		MyData md = new MyData("Rohith", 22);
		System.out.println("Name: "+md.myName());
		System.out.println("Age: "+md.myAge());
	}
}
