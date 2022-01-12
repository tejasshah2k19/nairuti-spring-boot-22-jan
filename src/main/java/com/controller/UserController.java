package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dao.UserDao;

@Controller
public class UserController {

	@Autowired
	UserDao dao;
	// signup
	// db -> fn em password

	public void signup() {

		dao.insertUser();// db -> param -> email fn pwd
	}

	// login

	public void login() {

		dao.authenticate();// em pwd
	}

}
