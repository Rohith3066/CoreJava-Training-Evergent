package com.evergent.corejava.collectionframework;
import java.util.*;
public class CF13_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("Mango");
		fruits.add("Grapes");
		System.out.println("Intial linkedHashSet: "+fruits);
		System.out.println("Iterating over linkedHashSet: ");
		for(String s : fruits) {
			System.out.println(s);}
		System.out.println("Contains Mango: "+fruits.contains("Mango"));
		System.out.println("After removing Banana : "+fruits.remove("banana"));
		System.out.println(fruits.size());
		fruits.clear();
		System.out.println("Final linked list: "+fruits);
	}
}
