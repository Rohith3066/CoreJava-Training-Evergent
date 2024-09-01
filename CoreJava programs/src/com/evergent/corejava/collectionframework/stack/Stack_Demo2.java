package com.evergent.corejava.collectionframework.stack;
import java.util.*;
public class Stack_Demo2 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Red");
		s.push("Black");
		s.push("White");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
	}
}
