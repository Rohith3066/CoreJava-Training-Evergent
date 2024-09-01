package com.evergent.corejava.collectionframework.queues;
import java.util.*;
public class Queue_ArrayDeque8 {
	public static void main(String[] args) {
		Deque<String> ad = new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		ad.offer("Apple");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
		
	}
}
