package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;

//@Controller
//@Repository
//@Service
//@Component 


@Repository
public class StudentDao {

	@Autowired
	JdbcTemplate stmt;

	// executeUpdate -> insert update delete
	// executeQuery --> select
	public void insertStudent(StudentBean student) {

		stmt.update("insert into student (name,email,password) values (?,?,?)", student.getFirstName(),
				student.getEmail(), student.getPassword());
	}
}
