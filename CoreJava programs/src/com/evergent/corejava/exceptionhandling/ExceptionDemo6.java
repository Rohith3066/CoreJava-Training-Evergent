package com.evergent.corejava.exceptionhandling;
//Try followed by either catch block or finally block.
public class ExceptionDemo6 {
	String name = "null";
	public void MyData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			System.out.println("End");
		}
		finally {			
			System.out.println("Finally Block for closing database or network coonections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 ed6 = new ExceptionDemo6();
		ed6.MyData();		
	}
}
