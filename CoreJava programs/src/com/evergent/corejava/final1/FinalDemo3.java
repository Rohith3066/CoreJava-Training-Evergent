package com.evergent.corejava.final1;

final class Myclass2{//final class cannot be inherited
	final public void myProducts() {
		System.out.println("All products");
	}
}
public class FinalDemo3 //extends Myclass2
{
	final String name="India";
		public void myProducts1() {
		System.out.println("Hello products");	}
	public static void main(String[] args) {
		FinalDemo3 f = new FinalDemo3();
		f.myProducts1();
		Myclass2 m = new Myclass2();
		m.myProducts();
		}
}
