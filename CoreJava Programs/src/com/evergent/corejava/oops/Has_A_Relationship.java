package com.evergent.corejava.oops;

public class Has_A_Relationship {
	public void data() {
		System.out.println("checking has-A relationship");
	}
	public static void main(String[]args) {
		Has_A_Relationship h = new Has_A_Relationship();
		h.data();
		Methodoverloading mr = new Methodoverloading();
		mr.loginDetails();
		}
}
