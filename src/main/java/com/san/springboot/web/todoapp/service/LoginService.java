package com.san.springboot.web.todoapp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("in28Minutes") 
				&& password.equalsIgnoreCase("test");
	}
}
