package com.evergent.corejava.logicalprogramming1;

public class Fibbinocci {

	public static void main(String[] args) {
		int n=5;
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<5;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
	}

}
