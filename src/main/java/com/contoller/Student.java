package com.contoller;

import org.springframework.stereotype.Component;

//@Component // create an object for you and also push into container
public class Student {
	
	public Student(String studentName) {
		super();
		StudentName = studentName;
	}

	public String StudentName="Gaurav Singh";

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	
}
