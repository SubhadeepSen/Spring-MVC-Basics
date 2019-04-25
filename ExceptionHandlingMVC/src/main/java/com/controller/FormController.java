package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.MyForm;
import com.exception.MyFormException;

@Controller
public class FormController {

	@RequestMapping(value="/")
	public String indexPage(){
		return "index";
	}

	@RequestMapping(value="/loginForm",method=RequestMethod.POST)
	@ExceptionHandler(MyFormException.class)
	public String loginForm(MyForm form,Model model) throws MyFormException{
		if(form.getPassword().length()<5)
			throw new MyFormException("Password incorrect");
		else if(form.getUserName().equalsIgnoreCase("subhadeep") && form.getPassword().equals("12345")){
			System.out.println(form.getUserName());
			model.addAttribute("name", form.getUserName());
			return "success";
		}
		else{
			model.addAttribute("message", "Username incorrect");
			return "index";
		}
	}

}
