package com.evergent.corejava.studentappication;
import java.util.*;
public class StudentDAO {
	public int addBook(StudentBean studentBean)
	{
		try{
			ArrayList studentList=new ArrayList();
			studentList.add(studentBean.getStudentId());
			studentList.add(studentBean.getStudentName());
			studentList.add(studentBean.getTotalMarks());
			studentList.add(studentBean.getGrade());
			studentList.add(studentBean.getAverage());
			
			System.out.println(studentList);
			
			System.out.println("Student ID :"+studentBean.getStudentId());
			System.out.println("Student Name :"+studentBean.getStudentName());
			System.out.println("Total Marks :"+studentBean.getTotalMarks());
			System.out.println("Student Grade :"+studentBean.getGrade());
			System.out.println("Total marks average :"+studentBean.getAverage());

			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
