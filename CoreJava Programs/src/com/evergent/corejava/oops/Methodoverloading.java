package com.evergent.corejava.oops;

public class Methodoverloading {
	
	public void loginDetails() {
		System.out.println("These are ur details");
	}
	public void loginDetails(String name,String pass) {
		System.out.println("name: "+name+"password: "+pass);
	}
	public void loginDetails(int num,String pass) {
		System.out.println("usernumber: "+num+" password: "+pass);
	}
	public void loginDetails(int num,String pass,int code) {
		System.out.println("usernumber: "+num+" password: "+pass+" enter code: "+code);
	}
	public static void main(String[] args) {
		
		Methodoverloading movrldng = new Methodoverloading();
		movrldng.loginDetails();
		movrldng.loginDetails("Rohith", "1234");
		movrldng.loginDetails(111111, "@@@@");
		movrldng.loginDetails(1234, "pass", 998877);
	}

}
