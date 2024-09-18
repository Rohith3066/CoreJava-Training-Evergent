package com.evergent.corejava.studentappication;

import java.io.Serializable;

public class StudentBean implements Serializable {
	
	private float average;
	private String grade;
	private int studentId;
	private String studentName;
	private float totalMarks;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public void setAverage(float average) {
		this.average = average;
	}
	public float getAverage() {
		return average;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
