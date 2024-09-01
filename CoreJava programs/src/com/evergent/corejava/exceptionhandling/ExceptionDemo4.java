package com.evergent.corejava.exceptionhandling;
//17.We should follow exception hierarchy.
public class ExceptionDemo4 {

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
	}
	public static void main(String[] args) {
		ExceptionDemo4 ed4 = new ExceptionDemo4();
		ed4.MyData();
		
	}

}
