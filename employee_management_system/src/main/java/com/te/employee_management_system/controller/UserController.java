package com.te.employee_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.employee_management_system.dto.UserInfo;
import com.te.employee_management_system.dto.UserResponce;
import com.te.employee_management_system.service.ServiceLayer;

@RestController
@RequestMapping("/ems")
public class UserController {
	
	@Autowired
	private ServiceLayer service;
	

	@PostMapping(path = "/register")
	public ResponseEntity<UserResponce> registerNewUser(@RequestBody UserInfo reg) {
		UserInfo register = service.register(reg);
		UserResponce response = new UserResponce(false, register);
		return new ResponseEntity<UserResponce>(response, HttpStatus.OK);

	}

}
