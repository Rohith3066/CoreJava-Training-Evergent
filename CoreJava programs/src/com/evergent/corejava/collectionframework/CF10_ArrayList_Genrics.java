package com.evergent.corejava.collectionframework;
import java.util.*;
public class CF10_ArrayList_Genrics {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(23);
		al.add(1);
		al.add(500);
		al.add(100);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(Integer s :al) {
			System.out.println(s);
		}
	}
}
