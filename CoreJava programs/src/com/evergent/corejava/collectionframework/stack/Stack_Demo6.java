package com.evergent.corejava.collectionframework.stack;
import java.util.*;
public class Stack_Demo6 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("Red");
		s.push("Black");
		s.push("White");
		System.out.println(s);
		System.out.println("Enumeration Iteration");
		Enumeration e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator.....");
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("ForEach advance Loop");
		for(String s1:s) {
			System.out.println(s1);
		}
	}

}
