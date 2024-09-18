package com.evergent.corejava.exceptionhandling;
class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UserdefinedException4 {
	public static void validateScore(int score) throws InvalidScoreException{
		if(score <0 || score >100)
			throw new InvalidScoreException("Score must be between 0 and 100");
		else
			System.out.println("Score is valid");}
	public static void main(String[] args) {
		try {
			//UserdefinedException2 u = new UserdefinedException2();
			validateScore(110);		}
		catch(InvalidScoreException e) {
			System.out.println("caught the Exception:"+e.getMessage());
			System.out.println(e);}
		System.out.println("Program continues after handling the Exception");
	}
}
