package com.demo;

import com.demo.pojo.Student;
import com.demo.service.Studentdaoimpl;

public class MainClient {

	public static void main(String[] args) {
		
		Studentdaoimpl studentdaoimpl = new Studentdaoimpl();
		Student stude = new Student();
		// insert once record
		stude.setId(101);
		stude.setStudname("Anil");
		stude.setAge("24");
		studentdaoimpl.createStudent(stude);
		
		System.out.println("  done....");
	
	}

}