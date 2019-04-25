package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Details;

@Controller
public class RedirectController {
	
	@RequestMapping(value="/")
	public String indexPage(){
		return "index";
	}
	
	@RequestMapping(value="/redirectForm")
	public String redirectPage(){
		System.out.println("Redirecting.....");
		return "redirect:redirect";
	}
	
	@RequestMapping(value="/redirect")
	public String redirect(Model model){
		System.out.println("Redirecting.....");
		model.addAttribute("name", "REDIRECT");
		model.addAttribute("city", "PAGE");
		return "showRedirect";
	}
	
	@RequestMapping(value="/forwardForm")
	public String forwardPage(Details details){
		System.out.println("Forwarding..... "+details.getName());
		return "forward:forward";
	}
	
	@RequestMapping(value="/forward")
	public String forward(Details details){
		System.out.println("Forwarding..... "+details.getName());
		return "showForward";
	}

}
