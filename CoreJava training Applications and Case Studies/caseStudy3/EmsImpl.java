package com.evergent.corejava.caseStudy3;
import java.util.*;
public class EmsImpl {

	    private HashMap<Integer, Employee> employeeMap;

	    public EmsImpl() {
	        employeeMap = new HashMap<>();
	    }
	    public void addEmployee(Employee employee) {
	        employeeMap.put(employee.getId(), employee);
	    }
	    public Employee getEmployee(int id) {
	        return employeeMap.get(id);
	    }
	    public void updateEmployee(int id, String name, String department) {
	        Employee employee = employeeMap.get(id);
	        if (employee != null) {
	            employee.setName(name);
	            employee.setDepartment(department);
	        } else {
	            System.out.println("Employee with ID " + id + " not found.");
	        }
	    }
	    public void removeEmployee(int id) {
	        employeeMap.remove(id);
	    }
	    public void listAllEmployees() {
	        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
	            System.out.println(entry.getValue());
	        }
	    }
	    public static void main(String[] args) {
	    	EmsImpl ems = new EmsImpl();
	        ems.addEmployee(new Employee(1, "Rohith", "Engineering"));
	        ems.addEmployee(new Employee(2, "Rajesh", "Marketing"));
	        ems.addEmployee(new Employee(3, "Abhi", "HR"));
	        System.out.println("All Employees:");
	        ems.listAllEmployees();
	        System.out.println("\nRetrieve Employee with ID 2:");
	        Employee employee = ems.getEmployee(2);
	        System.out.println(employee);
	        System.out.println("\nUpdating Employee with ID 2:");
	        ems.updateEmployee(2, "Robert", "Sales");
	        System.out.println(ems.getEmployee(2));
	        System.out.println("\nRemoving Employee with ID 3:");
	        ems.removeEmployee(3);
	        System.out.println("\nAll Employees After Removal:");
	        ems.listAllEmployees();
	    }
	}



