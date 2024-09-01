package com.evergent.corejava.oops;

public class EncapMethodCreation {

	public void empty() {
		System.out.println("NO PARAMETERS WITH NO RETURN TYPE");
	}
	public void myData(int a,int b) {
		
		System.out.println(a+b);
	}
	public int add() {
		return 688;
	}
	public int Mul(int a ,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		EncapMethodCreation emc = new EncapMethodCreation();
		emc.empty();
		emc.myData(10,15);
		System.out.println(emc.add());
		System.out.println(emc.Mul(10, 15));
		

	}

}
