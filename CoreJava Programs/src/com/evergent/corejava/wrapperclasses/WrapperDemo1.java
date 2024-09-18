package com.evergent.corejava.wrapperclasses;
public class WrapperDemo1 {
	public static void main(String[] args) {
		int a=100;
		Integer i= new Integer(a);
		System.out.println(i);
		int a1=i.intValue();
		System.out.println(a);
	}
}
