package com.evergent.corejava.exceptionhandling;
/*If there is 2 exceptions in class, Developer should be
handle 1st exception then only 2nd exception will be handled */
public class ExceptionDemo3 {
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
	}
	public static void main(String[] args) {
		ExceptionDemo3 ed3 = new ExceptionDemo3();
		ed3.MyData();		
	}
}
