package com.evergent.corejava.collectionframework;
import java.util.*;
public class CF14_ArrayList_HashSet {
	public static void main(String[] args) {
		List<String> l= new ArrayList<>();
		l.add("Core-java");
		l.add("J2EE");
		l.add("MYJAVA");
		l.add("J2SE");
		System.out.println(l);
		Set<String> s= new HashSet<>(l);
		System.out.println(s);
		Set<String> s1= new HashSet<>();
		s1.add("Core-java");
		s1.add("J2EE");
		s1.add("MYJAVA");
		s1.add("J2SE");
		s1.add("Core-java");
		//s1.add("Hello");
		if(s.equals(s1)) {
			System.out.println("Same");
		}else
			System.out.println("not-Same");
		System.out.println(s.containsAll(s1));
	}
}
