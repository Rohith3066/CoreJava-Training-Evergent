package com.evergent.corejava.oops;

public class SingleInheritance extends EncapCalculation{
	public void show() {
		System.out.println("2nd method");
	}

	public static void main(String[] args) {
		
		SingleInheritance s = new SingleInheritance();
		s.show();
		s.add();
		}

}
