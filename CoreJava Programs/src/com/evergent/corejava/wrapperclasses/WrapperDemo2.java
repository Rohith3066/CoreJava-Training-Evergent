package com.evergent.corejava.wrapperclasses;
public class WrapperDemo2 {
	public static void main(String[] args) {
		int a=100;
		Integer i= new Integer(a);
		int a1=i.intValue();
		double d= 99.9999;
		Double dd = new Double(d);
		double ddd = dd.doubleValue();
		byte b1=127;
		Byte b2= new Byte(b1);
		byte b3=b2.byteValue();
		char ch = 'A';
		Character ch2= new Character(ch);
		char ch3=ch2.charValue();
		System.out.println(a);
		System.out.println(i);
		System.out.println(a1);
		System.out.println(d);
		System.out.println(dd);
		System.out.println(ddd);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
	}
}
