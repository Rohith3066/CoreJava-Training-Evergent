package com.evergent.corejava.collectionframework;
import java.util.*;
public class TreeSetDemo5 {
	public static void main(String[] args) {
		TreeSet al = new TreeSet();
		al.add(100);
		al.add(1005);
		al.add(1);
		al.add(100);
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
