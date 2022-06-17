package com.ojas.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ojas.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Serializable>{
	
	@Query(value="select * from student order by smarks ",nativeQuery=true)
	public List<StudentEntity> marksWithAssendingOrder();
	
	@Query(value="select * from student where sgrade='a' ",nativeQuery=true)
	public List<StudentEntity> studentWithGradeA();
	
	@Query(value="select * from student where sresult='pass' ",nativeQuery=true)
	public List<StudentEntity> passStudents();
	
	@Query(value="select * from student where sresult='fail' ",nativeQuery=true)
	public List<StudentEntity> failStudents();
	
	@Query(value="SELECT * FROM student order by smarks desc LIMIT 0,3 ",nativeQuery=true)
	public List<StudentEntity> topThrStudents();

}
