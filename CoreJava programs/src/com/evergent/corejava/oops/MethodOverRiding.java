package com.evergent.corejava.oops;

class AA{
	public void methodA() {
		System.out.println("Hy!!!Budddy");
	}
}

public class MethodOverRiding extends AA{
	public void methodA() {
		System.out.println("Hellooooo!!!!Buddyy");
	}
	public void methodB() {
		System.out.println("How R uh???");
	}
	public static void main(String[] args) {
		
		MethodOverRiding mr = new MethodOverRiding();
		mr.methodA();
		mr.methodB();
	}

}
