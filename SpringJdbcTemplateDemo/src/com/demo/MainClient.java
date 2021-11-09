package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentJdbcImplementation studentJDBCImpl = (StudentJdbcImplementation) context.getBean("studentdao");

		System.out.println("recored creation..");
		studentJDBCImpl.createStudent("ram1", "25");
		studentJDBCImpl.createStudent("tom", "26");

		// for update

		Student student = new Student();

		student.setId(6);// update the details on the bases of id
		student.setStudname("tom little");
		student.setAge("30");

		studentJDBCImpl.updateStudentRecord(student);

		/// retrive the list of students from DB

		List<Student> listofstudents = studentJDBCImpl.listAllStudents();
		{

			for (Student stud : listofstudents) {

				String studentname = stud.getStudname();
				String age = stud.getAge();

				System.out.println(" student  name " + studentname + "student age " + age);

			}

		}
		
	
		
		// for delete api
		
		Integer flag =studentJDBCImpl.deleteStudentById(1);
		
		if(flag!=0){
			System.out.println("record delete");
		}else {
			System.out.println(" not record delete");
			
		}
		
		
		//for view student by id
		
		Student viewbyid= studentJDBCImpl.viewStudentRecodById(2);
		
		System.out.println(" view of student details"+viewbyid.getStudname());
		
		
		System.out.println("done.......");

	}
}