package com.evergent.corejava.exceptionhandling;
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
public class UserdefinedException3 {
	public static void withDraw(double amount) throws InsufficientFundsException{
		double balance = 500.00;
		if(amount > balance)
			throw new InsufficientFundsException("Insufficient Funds for withdrawl");
		else
			System.out.println("withdrawl successful!!!");}
	public static void main(String[] args) {
		try {
			//UserdefinedException2 u = new UserdefinedException2();
			withDraw(600.00);		}
		catch(InsufficientFundsException e) {
			System.out.println("caught the Exception:"+e.getMessage());
			System.out.println(e);}
		System.out.println("Program continues after handling the Exception");
	}
}
