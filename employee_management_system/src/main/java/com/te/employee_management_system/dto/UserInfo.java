package com.te.employee_management_system.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
@Entity
@Table(name = "user_details")
public class UserInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Min(value = 4)
	private String name;
	
	@Id
	@Column(name = "user_name")
	private String userName;
	
	@Min(value = 18)
	private Integer age;
	
	private Double salary;
	
	private String role;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Please Enter valid E-mail")
	private String mail;
	
	@Size(min = 5,message = "Password must be five characters")
	private String password;

}
