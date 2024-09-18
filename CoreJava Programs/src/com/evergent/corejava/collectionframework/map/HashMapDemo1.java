package com.evergent.corejava.collectionframework.map;
import java.util.*;
public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(100, "Ramesh");
		h.put(200, "Bhanu");
		h.put(300, "Abbas");
		h.put(null, "Rohith");
		h.put(700, null);
		System.out.println(h);
	}
}
