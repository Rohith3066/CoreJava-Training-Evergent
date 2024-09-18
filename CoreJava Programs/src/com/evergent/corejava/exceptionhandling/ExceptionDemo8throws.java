package com.evergent.corejava.exceptionhandling;
//14.Throws an exception will be executed method by method.
public class ExceptionDemo8throws {
	String name = null;
	public void MyData() throws NullPointerException{
			System.out.println("ONE");
			System.out.println(name.length());
			System.out.println("End");
	}
	public void myInfo() throws NullPointerException{
		MyData();
		System.out.println("My Info methods");
	}
	public static void main(String[] args) {
		try {
		ExceptionDemo8throws ed8 = new ExceptionDemo8throws();
		ed8.myInfo();}
		catch(NullPointerException e) {
			System.err.println("I can handle : "+e);
		}
		
	}

}
