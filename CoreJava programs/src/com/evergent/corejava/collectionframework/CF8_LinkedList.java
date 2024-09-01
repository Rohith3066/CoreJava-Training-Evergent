package com.evergent.corejava.collectionframework;
import java.util.*;
public class CF8_LinkedList {
	public static void main(String[] args) {
		LinkedList fruits = new LinkedList();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("dates");
		System.out.println("Intial linked list: "+fruits);
		fruits.addFirst("Mango");
		System.out.println("After adding linked list: "+fruits);
		System.out.println("Element at index-2: "+fruits.get(2));
		fruits.removeFirst();
		System.out.println("After removing First node : "+fruits);
		fruits.removeLast();
		System.out.println("After removing Last node: "+fruits);
		fruits.remove("Banana");
		System.out.println("After removing Banana: "+fruits);
		System.out.println(fruits.size());
		fruits.clear();
		System.out.println("Final linked list: "+fruits);
	}

}
//fruits.add(null);