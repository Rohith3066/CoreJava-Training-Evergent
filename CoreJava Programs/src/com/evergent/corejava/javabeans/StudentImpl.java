package com.evergent.corejava.javabeans;
import java.io.Serializable;
 class StudentBean implements Serializable{
	private int sno;
	private String sname;
	private String add;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAdd(String add) {
		this.add = add;
	}	
	public String toString() {
		return "student no:"+sno+"\nstudent name: "+sname+"\nstudent address:"+add;
	}
}
public class StudentImpl{
	public static void main(String[] args) {	
		StudentBean s = new StudentBean();
		s.setSno(100);
		s.setSname("Rohith");
		s.setAdd("Hyderabad");
		System.out.println(s);
		}
}
