package com.evergent.corejava.exceptionhandling;
//14.Throws an exception will be executed method by method.
public class ExceptionDemo7 {
	String name = null;
	public void MyData() throws NullPointerException{
		
			System.out.println("ONE");
			System.out.println(name.length());
			System.out.println("End");
	}
	public static void main(String[] args) {
		try {
		ExceptionDemo7 ed6 = new ExceptionDemo7();
		ed6.MyData();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
	}

}
