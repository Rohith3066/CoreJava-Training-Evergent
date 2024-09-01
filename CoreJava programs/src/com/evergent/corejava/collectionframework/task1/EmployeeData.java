package com.evergent.corejava.collectionframework.task1;
import java.util.*;
class Employee { 
	private int id;
	private String name;
	private float salary;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	 
}
public class EmployeeData {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details");
		for(int i=0;i<3;i++){
			Employee obj=new Employee();
			System.out.println("Enter the id");
			obj.setId(sc.nextInt());
			System.out.println("Enter the name");
			obj.setName(sc.next());
			System.out.println("Enter the salary");
			obj.setSalary(sc.nextFloat());
			list.add(obj); 		}		 
	
		Iterator<Employee> obj=list.iterator();
		while(obj.hasNext()){
			System.out.println("Iterator order");
			Employee ob=obj.next();
			System.out.println(ob.getId()+ " "+ ob.getName()+ " "+ob.getSalary());
		} 

	}

}
