package com.evergent.corejava.collectionframework.queues;
import java.util.*;
public class Queue_LinkedList1 {
	public static void main(String[] args) {
		Deque<String> ll = new LinkedList<>();
		ll.add("Ravi");
		ll.add("Bhanu");
		ll.offer("Shankar");
		ll.offer("chandhu");
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.poll());
	}
}
