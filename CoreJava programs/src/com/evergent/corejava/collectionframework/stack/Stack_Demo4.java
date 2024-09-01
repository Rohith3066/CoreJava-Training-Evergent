package com.evergent.corejava.collectionframework.stack;
import java.util.*;
public class Stack_Demo4 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Red");
		s.push("Black");
		s.push("White");
		System.out.println(s);
		s.clear();
		boolean b = s.isEmpty();
		System.out.println(b);
		System.out.println(s);
	}
}
