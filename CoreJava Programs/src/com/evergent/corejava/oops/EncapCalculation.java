package com.evergent.corejava.oops;

public class EncapCalculation {
	int a=10,b=15;
	public void add(){
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		EncapCalculation e = new EncapCalculation();
		e.add();
	}

}
