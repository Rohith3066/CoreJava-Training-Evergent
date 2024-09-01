package com.evergent.corejava.collectionframework.queues;
import java.util.*;
public class Queue_LinkedList2 {
	public static void main(String[] args) {
		Deque<String> ll = new LinkedList<>();
		ll.add("Banana");
		ll.addFirst("Pineapple");
		ll.add("Watermelon");
		ll.addLast("Papaya");
		ll.offer("Apple");
		ll.offerLast("Mango");
		System.out.println(ll);
		System.out.println(ll.size());
		boolean t = ll.isEmpty();
		System.out.println(t);
		ll.clear();
		System.out.println(ll);
	}
}
