package com.evergent.corejava.objectclassmethods;
final class MyData{
	private final String name;
	public MyData(String name) {
		this.name=name;
	}
	public String myName() {
		return name;
	}
	public String toString() {
		return name;
	}
}
public class ImmutableString {

	public static void main(String[] args) {
		MyData md = new MyData("Rohith");
		System.out.println("Name: "+md.myName());
		System.out.println("Name: "+md.toString());
		}
}




		

