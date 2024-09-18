package com.evergent.corejava.studentappication;

public class StudentService {
	public int addBookService(int studentId,String studentName,float totalMarks)
	{  String grade="";
	
	   if(totalMarks<=600)
	   {
		   grade = "C";
	   }
	   else if(totalMarks<=800)
	   {
		   grade = "B";
		   
	   }
	   else
	   {
		   grade = "A";
	   }
		float t = totalMarks;
		float avg = (totalMarks/6);
		System.out.println(avg);
	   StudentDAO studentDAO = new StudentDAO();
	   StudentBean studentBean=new StudentBean();
	   studentBean.setStudentId(studentId);	
	   studentBean.setStudentName(studentName);
	   studentBean.setTotalMarks(totalMarks);
	   studentBean.setAverage(avg);
	   studentBean.setGrade(grade);
	
		   int updateResult= studentDAO.addBook(studentBean);
		
		return 1;
	}
}
