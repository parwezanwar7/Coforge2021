package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	
	// looking for data soruce like mysql db
	public void setDataSoruce(DataSource ds);
	
	// insert records for student
	public void createStudent(String name,String age);   //done
	
	// update records for student
	public void updateStudentRecord(Student student); // this method implemented..done
	
	// delete records for student
	public Integer deleteStudentById(Integer id);   ///done
	
	// view records for pertucular student
	public Student viewStudentRecodById(Integer id);  //done
	
	// view all records for students
	public List<Student> listAllStudents(); //done

}