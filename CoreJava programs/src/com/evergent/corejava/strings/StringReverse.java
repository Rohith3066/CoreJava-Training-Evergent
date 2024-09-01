package com.evergent.corejava.strings;

public class StringReverse {

	public static void main(String[] args) {
		String s ="Hello World,this is a test";
		StringBuilder builder = new StringBuilder(s);
		System.out.println(builder.reverse());

	}

}
