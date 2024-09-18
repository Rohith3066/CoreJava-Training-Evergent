package com.evergent.corejava.collectionframework;
import java.util.*;
public class CF7_Vector {
	public static void main(String[] args) {
		Vector al = new Vector();
		al.add(100);
		al.add("Hello");
		al.add(45.5);
		al.add(true);
		al.add(null);
		al.add(100);
		Enumeration e = al.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());		

		}
	}
}
