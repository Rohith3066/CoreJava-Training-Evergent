package com.evergent.corejava.collectionframework.map;
import java.util.*;
public class HashtableDemo2 {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(100, "Ramesh");
		h.put(200, "Bhanu");
		h.put(300, "Abbas");
		//h.put(null, "Rohith");
		//h.put(700, null);
		//Null keys and values are not allowed
		System.out.println(h);
	}

}
