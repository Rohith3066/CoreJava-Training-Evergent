package com.evergent.corejava.collectionframework.queues;
import java.util.*;
public class Queue_Demo5_ReverseOrder {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(8);
		pq.add(5);
		pq.add(1);
		pq.offer(2);
		pq.offer(9);
		pq.add(11);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
