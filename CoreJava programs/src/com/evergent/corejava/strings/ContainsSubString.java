package com.evergent.corejava.strings;
public class ContainsSubString {
	public static void main(String[] args) {
		String s = "the quick brown fox jumps over the lazy dog";
		String substr = "fox";
		boolean contains = s.contains(substr);
		System.out.println("contains "+ substr +":"+contains);
		}
}
