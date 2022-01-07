package com.te.employee_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.employee_management_system.dao.UserDao;
import com.te.employee_management_system.dto.UserInfo;

@Service 
public class ServiceImplementation implements ServiceLayer {

	@Autowired
	private UserDao dao;

	@Override
	public UserInfo register(UserInfo info) {
		if(info != null) {
			return dao.save(info);
		}
		return null;

		
	}

}
