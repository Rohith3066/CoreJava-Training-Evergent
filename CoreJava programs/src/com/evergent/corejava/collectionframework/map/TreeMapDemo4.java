package com.evergent.corejava.collectionframework.map;
import java.util.*;
public class TreeMapDemo4 {
	public static void main(String[] args) {
		TreeMap<Integer,String> h = new TreeMap<>();
		h.put(100, "Ramesh");
		h.put(400, "Bhanu");
		h.put(300, "Abbas");
		h.put(200, "Rohith");
		System.out.println(h);
		System.out.println("Student record sorted by Id");
		for(Map.Entry<Integer, String> e :h.entrySet()) {
			System.out.println("ID :"+e.getKey()+", Name: "+e.getValue());
		}
//		for(Integer s : h.keySet()) {
//			System.out.println(s);
//		}
//		for(String s : h.values()) {
//			System.out.println(s);
//		}
	}

}
