package com.evergent.corejava.javabeans;
import java.io.Serializable;
 class Employee implements Serializable{
	private int eno;
	private String ename;
	private int esal;
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getEno() {
		return eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public int getEsal() {
		return esal;
	}
}
public class EmpImpl{
	public static void main(String[] args) {	
		Employee e = new Employee();
		e.setEno(100);
		e.setEname("Rohith");
		e.setEsal(50000);		
		System.out.println("Employee number:"+e.getEno());
		System.out.println("Employee name:"+e.getEname());
		System.out.println("Employee salary:"+e.getEsal());
		}
}
