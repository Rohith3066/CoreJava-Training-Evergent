package com.evergent.corejava.strings;
public class StringBuilderExmp {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("Initial String: "+sb);
		sb.append("world");
		System.out.println("After append: "+sb);
		sb.insert(6, "Beautiful");
		System.out.println("After insert: "+sb);
		sb.replace(0, 5, "Hi");
		System.out.println("After replace: "+sb);
		sb.delete(0, 3);
		System.out.println("After delete: "+sb);
		sb.reverse();
		System.out.println("After reverse: "+sb);
		System.out.println("Capacity"+sb.capacity());
		System.out.println("length"+sb.length());
	}
}
