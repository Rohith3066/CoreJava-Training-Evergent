package com.evergent.corejava.oops;

class A{
	public void methodA(){
		System.out.println("1st method");
	}
}
class B extends A{
	public void methodB() {
		System.out.println("2nd method");
	}
}
public class MultiLevelInheritance extends B{
	public void show() {
		System.out.println("3rd method");
	}
	public void demo() {
		System.out.println("4th method");
	}

	public static void main(String[] args) {
		
		MultiLevelInheritance s = new MultiLevelInheritance();
		s.methodA();
		s.methodB();
		s.show();
		s.demo();
		}

}
