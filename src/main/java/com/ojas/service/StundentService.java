package com.ojas.service;

import java.util.List;

import com.ojas.model.Student;

public interface StundentService {
	
	public List<Student> assendingOrderWithMarks();
	public List<Student> securedGradeA();
	public List<Student> passedStudents();
	public List<Student> failStudents();
	public List<Student> topThreeeStudents();
    
	
}
