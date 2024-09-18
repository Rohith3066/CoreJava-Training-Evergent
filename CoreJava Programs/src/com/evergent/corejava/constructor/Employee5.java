package com.evergent.corejava.constructor;

public class Employee5 {
	int num;
	String name;
	double salary;
	public Employee5() {
		System.out.println("Default constructor");
		
	}
	 Employee5(int num) {
		this.num=num;	
	}
	Employee5(int num,String name,double salary){
		this(num);
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("ID num: "+num);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
	}
	public static void main(String[] args) {
		new Employee5();
		Employee5 emp = new Employee5(123,"Rohith",50000);
		emp.display();
	}
}
