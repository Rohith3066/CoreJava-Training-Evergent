package com.evergent.corejava.exceptionhandling;
/*11.Try for business logic.
12.Catch for handling Exceptions.
13.Finally is block if Exception is occur or not 
	finally block will be executed.*/
public class ExceptionDemo5 {
	String name = null;//"null"
	int k=0;
	public void MyData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle :"+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle :"+e);
		}
		catch(Exception e) {
			System.out.println("I can handle :"+e);
		}
		finally {
			System.out.println("Finally Block for closing database or network coonections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed5 = new ExceptionDemo5();
		ed5.MyData();
		
	}
}
