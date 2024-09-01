package com.evergent.corejava.wrapperclasses;
import java.util.*;
public class WrapperDemo3_ArrayList {
	public static void main(String[] args) {	
		int a=100;
		Integer i = new Integer(a);
		ArrayList al = new ArrayList();
		al.add(i);
		System.out.println(al);
		Integer i2 = new Integer(200);
		al.add(i2);
		System.out.println(al);
		al.add(new Integer(45));
		System.out.println(al);
		System.out.println(al.get(1));		
	}
}
