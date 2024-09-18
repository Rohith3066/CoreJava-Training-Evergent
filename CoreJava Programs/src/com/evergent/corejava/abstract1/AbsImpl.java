package com.evergent.corejava.abstract1;
abstract class Products{
	abstract public void newproducts();
	public void myproducts() {
		System.out.println("My products");
	}
}
public class AbsImpl extends Products{
	public void show() {
		System.out.println("this is  LOCAL method");
	}
	public void newproducts() {
		System.out.println("New products");
	}
/*	public static void main(String[] args) {
		Products a = new AbsImpl();
We cannot create object to abstract class but we can
create reference to abstract class.
		a.show();
		a.myproducts();
		a.newproducts();
}*/
	public static void main(String[] args) {
		AbsImpl a = new AbsImpl();
		a.show();
		a.myproducts();
		a.newproducts();
	}
}
