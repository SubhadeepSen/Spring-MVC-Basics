package com.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Form {
	@NotNull @Size(min=2, max=30) 
	private String fullName;

	@NotNull @Min(18) @Max(80)
	private String age;

	@NotNull @Size(min=10,message="Phone number must be at least 10 characters")
	private String contactNo;
	
	@NotEmpty @Email
	private String emailId;
	
	@NotNull @Min(5)
	private String password;

	public Form(){

	}
	public Form(String fullName, String age, String contactNo, String emailId, String password) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
