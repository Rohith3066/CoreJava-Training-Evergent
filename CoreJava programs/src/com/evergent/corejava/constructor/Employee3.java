package com.evergent.corejava.constructor;

public class Employee3 {
	int num;
	String name;
	double salary;
	public Employee3() {
		System.out.println("Default constructor");
	}
	Employee3(int num,String name,double salary){
		this.num=num;
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("ID num: "+num);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
	}
	public static void main(String[] args) {
		new Employee3();
		Employee3 emp = new Employee3(123,"Rohith",50000);
		emp.display();
		

	}

}
