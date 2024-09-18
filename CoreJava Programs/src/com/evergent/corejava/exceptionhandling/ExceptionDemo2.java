package com.evergent.corejava.exceptionhandling;
/*
3.All exceptions are executed while abnormal conditions only.
4.Normal flow it won’t execute any exception.
5.Once any exceptions are occurring in java code then remain lines of code is unreachable.
 */
public class ExceptionDemo2 {
	String name = null;//"null"
	public void MyData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle :"+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo2 ed2 = new ExceptionDemo2();
		ed2.MyData();		
	}}
