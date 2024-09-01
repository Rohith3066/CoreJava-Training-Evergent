package com.evergent.corejava.collectionframework;
import java.util.*;
public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Hello");
		al.add(45.5);
		al.add(true);
		al.add(null);
		al.add(100);
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
