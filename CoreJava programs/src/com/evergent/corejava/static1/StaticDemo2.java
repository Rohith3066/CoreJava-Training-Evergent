package com.evergent.corejava.static1;
public class StaticDemo2 {
	static String cname="India";
	String name="Rohith";
	static public void myData() {
		System.out.println("My data");
	}
	public void show() {
		System.out.println("show is non static method");
	}
	public static void main(String[] args) {
		myData();
		System.out.println(cname);
	}
}
