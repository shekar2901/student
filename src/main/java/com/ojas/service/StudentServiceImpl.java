package com.ojas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.StudentEntity;
import com.ojas.model.Student;
import com.ojas.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StundentService {

	@Autowired
	private StudentRepository srepo;

	public List<Student> assendingOrderWithMarks() {
		List<Student> stdlist = new ArrayList<>();
		List<StudentEntity> st = srepo.marksWithAssendingOrder();
	
		st.forEach(stdt1 -> {
			Student std = new Student();
			BeanUtils.copyProperties(stdt1, std);

			stdlist.add(std);

		});

		return stdlist;
	}

	public List<Student> securedGradeA() {

		List<Student> stdlist = new ArrayList<>();
		List<StudentEntity> st = srepo.studentWithGradeA();
		st.forEach(stdt1->{
			
			Student std=new Student();
			BeanUtils.copyProperties(stdt1, std);
			stdlist.add(std);
		});
		
		return stdlist;
	}

	public List<Student> passedStudents() {

		List<Student> stdlist = new ArrayList<>();
		List<StudentEntity> st = srepo.passStudents();
		st.forEach(stdt1->{
			
			Student std=new Student();
			BeanUtils.copyProperties(stdt1, std);
			stdlist.add(std);
		});
		
		return stdlist;
		
		
	}

	public List<Student> failStudents() {

		List<Student> stdlist = new ArrayList<>();
		List<StudentEntity> st = srepo.failStudents();
		st.forEach(stdt1->{
			
			Student std=new Student();
			BeanUtils.copyProperties(stdt1, std);
			stdlist.add(std);
		});
		
		return stdlist;
	}

	public List<Student> topThreeeStudents() {
		List<Student> stdlist = new ArrayList<>();
		List<StudentEntity> st = srepo.topThrStudents();
		st.forEach(stdt1->{
			
			Student std=new Student();
			BeanUtils.copyProperties(stdt1, std);
			stdlist.add(std);
		});
		
		return stdlist;
		
		
	}

}
