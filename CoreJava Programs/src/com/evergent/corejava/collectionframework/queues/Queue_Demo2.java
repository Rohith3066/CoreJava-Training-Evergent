package com.evergent.corejava.collectionframework.queues;
import java.util.*;
public class Queue_Demo2 {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(8);
		pq.add(5);
		pq.offer(2);
		pq.offer(9);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
	}
}
