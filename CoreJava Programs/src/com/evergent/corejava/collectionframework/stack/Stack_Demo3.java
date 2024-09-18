package com.evergent.corejava.collectionframework.stack;
import java.util.*;
public class Stack_Demo3 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Red");
		s.push("Black");
		s.push("White");
		System.out.println(s);
		System.out.println(s.search("Red"));
		System.out.println(s.pop());
		System.out.println(s.peek());		
	}
}
