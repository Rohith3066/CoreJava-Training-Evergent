package com.evergent.corejava.static1;
public class StaticDemo5 {
	static String cname="India";
	static {
		System.out.println("static Block");
	}
	static public void myData() {
		System.out.println("My data");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
	}
}
