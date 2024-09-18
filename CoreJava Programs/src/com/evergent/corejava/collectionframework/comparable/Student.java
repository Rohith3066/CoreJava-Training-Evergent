package com.evergent.corejava.collectionframework.comparable;

public class Student implements Comparable<Student>  {
	 private String name;
	    private int age;

	    // Constructor
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	  
	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    // toString method for printing Student details
	    @Override
	    public String toString() {
	        return "Student{name='" + name + "', age=" + age + "}";
	    }

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return 0;
		}
}
