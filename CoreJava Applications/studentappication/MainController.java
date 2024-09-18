package com.evergent.corejava.studentappication;
import java.util.*;
public class MainController {

	public static void main(String[] args) {
		int studentId=0;
		String studentName="";
		float totalMarks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter student ID");
		studentId=sin.nextInt();
		System.out.println(("Enter student name"));
		studentName = sin.next();
		System.out.println("Enter Total marks obtained");
		totalMarks = sin.nextFloat();
		
		StudentService StduentService = new StudentService();
		
		int updeateCount=StduentService.addBookService(studentId,studentName,totalMarks);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record RK Success");
		
	}

}
