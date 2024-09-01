package com.evergent.corejava.final1;

class Myclass{
	final public void myProducts() {
		System.out.println("All products");
	}
}
public class FinalDemo2 extends Myclass{
	
	final String name="India";
	//Final methods cannot be override 
//	public void myProducts() {
//		System.out.println("Hello products");	}
	public static void main(String[] args) {
		FinalDemo2 f = new FinalDemo2();
		f.myProducts();
		}
}
