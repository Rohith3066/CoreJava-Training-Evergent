package com.evergent.corejava.static1;
public class StaticDemo3 {
	static String cname="India";
	String name="Rohith";
	static public void myData() {
		//Cannot make a static reference to the non-static method show() from the type StaticDemo3
		//show();
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
