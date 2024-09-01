package com.evergent.corejava.strings;
public class SplitDemo1 {
	public static void main(String[] args) {
		String str = "Java is a very powerful programming language";
		String[] words = str.split(" ");
		for(String w : words) {
			System.out.println(w);
		}
	}
}
