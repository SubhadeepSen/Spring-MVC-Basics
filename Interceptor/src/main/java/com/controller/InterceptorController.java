package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
	@RequestMapping(value="/")
	public String indexPage(){
		return "index";
	}
}
