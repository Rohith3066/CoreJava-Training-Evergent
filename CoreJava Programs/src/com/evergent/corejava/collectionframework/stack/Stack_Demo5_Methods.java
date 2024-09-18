package com.evergent.corejava.collectionframework.stack;
import java.util.*;
public class Stack_Demo5_Methods {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("Apple");
		s.push("Banana");
		s.push("Cherry");
		s.push("Date");
		System.out.println("Stack :"+s);
		System.out.println("Top Element :"+s.peek());
		System.out.println("popped element :"+s.pop());
		System.out.println(s);
		System.out.println("===============");
		System.out.println("Is stack empty: "+s.isEmpty());
		int pos=s.search("Banana");
		if(pos!=-1)
			System.out.println("Position of 'Banana' from top : "+pos);
		else
			System.out.println("Banana is not in the stack");
		s.clear();
		System.out.println("stack after clearing : "+s);
	}
}
