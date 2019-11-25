package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/insertName")
	public String enterName() {
		return "insert-name";
	}
	
	@RequestMapping("/displayName")
	public String displayName() {
		return "display-name";
	}
	
//	@RequestMapping("/displayNameVersion2") 
//	public String letsShoutDude(HttpServletRequest request, Model model) {
//		String name = request.getParameter("studentName");
//		String modified = name.toUpperCase();
//		String result = "Yo!!" + modified;
//		model.addAttribute("message",result);
//		return "display-name2";
//	}
	
//	another method to read http request data
	@RequestMapping("/displayNameVersion2")
	public String letsShoutDude(@RequestParam("studentName") String theName,Model model) {
		String result = "Yo!! I am from annotation method" + theName.toUpperCase();
		model.addAttribute("message", result);
		return "display-name2";
	}
	
}
