package com.evergent.corejava.collectionframework;
import java.util.*;
class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
public class CF9_ArrayListBookObject {
	public static void main(String[] args) {
		Book b1=new Book("coreJAVA");
		Book b2=new Book("Let us C");
		Book b3=new Book("JAVA Index Book");
		Book b4=new Book("JAVA Interview Book");
		ArrayList al = new ArrayList();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		System.out.println(al);
//		Iterator i = al.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}	
	}
}
