package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Form;

@Controller
public class FormValidationController {

	@RequestMapping(value="/")
	public String indexPage(){
		return "index";
	}

	@RequestMapping(value="/validateForm",method=RequestMethod.POST)
	public String validateForm(@Valid Form form,BindingResult result){
		if(result.hasErrors()){
			return "index";
		}
		return "success";
	}
}
