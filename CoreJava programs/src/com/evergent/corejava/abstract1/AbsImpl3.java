package com.evergent.corejava.abstract1;
abstract class Product3{
	public Product3() {
		System.out.println("abstract constructor");
	}
	abstract public void newproducts();
	public void myproducts() {
		System.out.println("My products");
	}
}
public class AbsImpl3 extends Product3{
	public AbsImpl3() {
		
		System.out.println("Implementation constructor");
	}
	public void show() {
		System.out.println("this is  LOCAL method");
	}
	public void newproducts() {
		System.out.println("New products");
	}
	public static void main(String[] args) {
		AbsImpl3 a = new AbsImpl3();
		a.show();
		a.myproducts();
		a.newproducts();
	}
}
