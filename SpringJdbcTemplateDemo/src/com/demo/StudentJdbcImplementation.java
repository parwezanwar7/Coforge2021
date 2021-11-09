package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StudentJdbcImplementation implements StudentDAO {

	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;

	public void setDataSoruce(DataSource ds) {

		this.dataSourceprop = ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);

	}

	// api for create method
	// user deifined method and you have to write logic
	public void createStudent(String studname, String age) {

		String sql = "insert  into student(studname,age) values(?,?)";

		JdbcTemplateoobject.update(sql, studname, age);

		return;

	}


	public Student viewStudentRecodById(Integer studentid) {

	
		String sql = "SELECT * FROM student WHERE id = ?";
		Student stduentBean = JdbcTemplateoobject.queryForObject(sql, new Object[] { studentid },
				new  BeanPropertyRowMapper<Student>(
						Student.class));
		return stduentBean;

	}

	@Override
	public List<Student> listAllStudents() {

		List<Student> studentlist = new ArrayList<Student>();

		String studentlistsql = "select * from student";

		// any of else can be used
		// studentlist = JdbcTemplateoobject.query(studentlistsql,new
		// StudentJbdcRowMapper(Student.class));

		studentlist = JdbcTemplateoobject.query(studentlistsql, new BeanPropertyRowMapper(Student.class));

		return studentlist;
	}

	/// api for update

	@Override
	public void updateStudentRecord(Student student) {
		String udpdatestudedntrecord = "UPDATE student SET studname = ?, age= ?  where id= ?";
		JdbcTemplateoobject.update(udpdatestudedntrecord,
				new Object[] { student.getStudname(), student.getAge(), Integer.valueOf(student.getId()) });
	}

	// api for delete fucntion

	public Integer deleteStudentById(Integer studentid) {

		String deletequery = "delete from student where id = ?";

		return JdbcTemplateoobject.update(deletequery, new Object[] {

				Integer.valueOf(studentid) });

	}

}