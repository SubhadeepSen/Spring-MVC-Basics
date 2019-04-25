package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bean.Student;

@Controller
@SessionAttributes("studentSession")
public class SessionController {

	@RequestMapping(value="/")
	public String indexPage(){
		return "index";
	}
	
	@RequestMapping(value="/manageSession",method=RequestMethod.POST)
	public String showDetails(Student student,Model model){
		model.addAttribute("studentSession", "I am session variable");
		//model.addAttribute("studentSession", student);
		return "studentDetails";
	}
}
