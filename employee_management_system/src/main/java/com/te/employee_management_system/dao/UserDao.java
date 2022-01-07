package com.te.employee_management_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.employee_management_system.dto.UserInfo;


@Repository
public interface UserDao extends JpaRepository<UserInfo, String> {

}
