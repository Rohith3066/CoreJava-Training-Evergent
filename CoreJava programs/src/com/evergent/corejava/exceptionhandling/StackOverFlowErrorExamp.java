package com.evergent.corejava.exceptionhandling;
public class StackOverFlowErrorExamp {
	public static void recursiveMethod() {
		recursiveMethod();
	}
	public static void main(String[] args) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverflowError Caught : " +e.getMessage());
		}
	}

}
