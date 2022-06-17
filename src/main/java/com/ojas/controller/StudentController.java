package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Student;
import com.ojas.service.StudentServiceImpl;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImpl simpl;
	
	@GetMapping("/stdmarkswithorder")
	public List<Student> getMarksWithOrder(){
		List<Student> std=simpl.assendingOrderWithMarks();
		
		return std;
	}
	
	@GetMapping("/gradeswithA")
	public List<Student> getStudentWithGradeA(){
		List<Student> std=simpl.securedGradeA();
		
		return std;
		
	}
	
	@GetMapping("/passstunts")
	public List<Student> getPassStudents(){
		List<Student> std=simpl.passedStudents();
		return std;
	}
	
	@GetMapping("/failstudents")
	public List<Student> getFailStudents(){
		List<Student> std=simpl.failStudents();
		return std;
	}
	
	@GetMapping("/topthree")
	public List<Student> getTopThree(){
		List<Student> std=simpl.topThreeeStudents();
		return std;
	}

}
