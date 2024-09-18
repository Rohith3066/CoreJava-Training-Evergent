package com.evergent.corejava.collectionframework.map;
import java.util.*;
public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String,String> h = new HashMap<>();
		h.put("India", "Delhi");
		h.put("USA", "Washington DC");
		h.put("Germany", "Berlin");
		h.put("India", "Delhi");
		System.out.println(h);
		for(String s : h.keySet()) {
			System.out.println(s);
		}
//		for(Map.Entry<String, String> e :h.entrySet()) {
//			System.out.println("ID :"+e.getKey()+", Name: "+e.getValue());
//		}
	}

}
