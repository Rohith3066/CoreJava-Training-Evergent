package com.evergent.corejava.collectionframework.queues;
import java.util.*;
public class Queue_ArrayDeque6 {
	public static void main(String[] args) {
		Deque<String> ad = new ArrayDeque<>();
		ad.add("Ravi");
		ad.add("Bhanu");
		ad.offer("Shankar");
		ad.offer("chandhu");
		System.out.println(ad);
		System.out.println(ad.peek());
	}
}
