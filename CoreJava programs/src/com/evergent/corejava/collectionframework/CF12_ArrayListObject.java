package com.evergent.corejava.collectionframework;
import java.util.*;
public class CF12_ArrayListObject {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add(100);
		al.add("Hello");
		al.add(45.5);
		al.add(true);
		al.add(null);
		al.add(100);
		System.out.println(al);	
		for(Object o :al) {
			System.out.println(o);
		}
	}
}
