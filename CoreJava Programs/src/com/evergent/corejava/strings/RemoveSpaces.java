package com.evergent.corejava.strings;
public class RemoveSpaces {
	public static void main(String[] args) {
		String s ="Hello World,this is a test";
		String noSpaces = s.replace(" ","");
		System.out.println(noSpaces);
	}
}
