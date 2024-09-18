package com.evergent.corejava.collectionframework.queues;
import java.util.*;
public class Queue_LinkedList3 {
	public static void main(String[] args) {
		Deque<String> ad = new LinkedList<>();
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
		System.out.println(ad.poll());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollFirst());	
	}
}
