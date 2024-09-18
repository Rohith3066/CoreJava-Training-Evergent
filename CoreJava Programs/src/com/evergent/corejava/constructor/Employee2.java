package com.evergent.corejava.constructor;

public class Employee2 {
	int num;
	String name;
	double salary;
	public Employee2() {
		System.out.println("Default constructor");
	}
	Employee2(int num1,String name1,double salary1){
		num=num1;
		name=name1;
		salary=salary1;
	}
	public void display() {
		System.out.println("ID num: "+num);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
	}
	public static void main(String[] args) {
		new Employee2();
		Employee2 emp = new Employee2(123,"Rohith",50000);
		emp.display();
		

	}

}
