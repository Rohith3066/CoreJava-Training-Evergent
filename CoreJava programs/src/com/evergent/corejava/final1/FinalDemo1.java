package com.evergent.corejava.final1;

public class FinalDemo1 {
	
	final String name="India";
	public void myData() {
		//name="Welcome";
		//Final variables cannot be re-initialized
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		FinalDemo1 f = new FinalDemo1();
		f.myData();
		}
}
