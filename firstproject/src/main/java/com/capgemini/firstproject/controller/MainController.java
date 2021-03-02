package com.capgemini.firstproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(value="home" , method = RequestMethod.GET)
	//@ResponseBody
	public String home() {
		System.out.println("this is home page");
		return "home";
	}
}
