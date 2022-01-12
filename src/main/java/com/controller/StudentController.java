package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.StudentBean;
import com.dao.StudentDao;

@RestController
public class StudentController {
	
	@Autowired
	StudentDao studentDao;
	
	//http://localhost:9999/signup 
	
  //fn em pwd
	@PostMapping("/signup")
	public  ResponseEntity<StudentBean> signup(StudentBean student) {
		//db store
		
		studentDao.insertStudent(student);
		ResponseEntity<StudentBean> r = new ResponseEntity<StudentBean>(student, HttpStatus.ACCEPTED);
		return r;
	}
}
