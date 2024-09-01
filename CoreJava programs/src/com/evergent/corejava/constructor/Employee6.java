package com.evergent.corejava.constructor;

class MyEmployee{
	int num;
	public MyEmployee() {
		
	}
	MyEmployee(int num) {
		this.num=num;
		System.out.println("ID num: "+num);
		
	}
}
public class Employee6 extends MyEmployee{
			int num;
			String name;
			double salary;
	public Employee6() {
	System.out.println("Default constructor");
}
	Employee6(int num,String name,double salary){
		super(num);
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
	}
	public static void main(String[] args) {
		new Employee6();
		Employee6 emp = new Employee6(123,"Rohith",50000);
		emp.display();

	}

}
