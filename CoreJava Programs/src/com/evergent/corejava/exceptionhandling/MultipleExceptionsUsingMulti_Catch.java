package com.evergent.corejava.exceptionhandling;
//Handling multiple-Exceptions using multi-Catch Block.
public class MultipleExceptionsUsingMulti_Catch {
	String name = null;
	int k=2;
	public void MyData(){
		
			System.out.println("ONE");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
	}
	public static void main(String[] args) {
		try {
		MultipleExceptionsUsingMulti_Catch ed6 = new MultipleExceptionsUsingMulti_Catch();
		ed6.MyData();
		}
		catch(NullPointerException  | ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
