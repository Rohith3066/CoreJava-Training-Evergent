package com.evergent.corejava.exceptionhandling;
//Handling multiple-Exceptions using throws.
public class MultipleExceptionsUsingthrows {
	String name = "null";
	int k=0;
	public void MyData() throws NullPointerException,ArithmeticException{
		
			System.out.println("ONE");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
	}
	public static void main(String[] args) {
		try {
		MultipleExceptionsUsingthrows ed6 = new MultipleExceptionsUsingthrows();
		ed6.MyData();
		}
		catch(Exception e) {
			System.out.println(e);
		}		
	}
}
