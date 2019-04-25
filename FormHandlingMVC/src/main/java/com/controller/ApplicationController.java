package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Student;

@Controller
public class ApplicationController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String indexPage(){
		return "index";
	}
	
	@RequestMapping(value="/formHandler",method=RequestMethod.POST)
	public String addStudent(Student student){
		System.out.println("..........INSIDE............");
		System.out.println("Name : "+student.getFirstName()+" "+student.getLastName());
		System.out.println("Age : "+student.getAge());
		System.out.println("City : "+student.getCity());
		return "studentDetails";
	}

}
