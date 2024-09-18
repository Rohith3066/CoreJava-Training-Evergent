package com.evergent.corejava.caseStudy3;

public class Employee {
	int id;
	public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	String name;
	String department;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
