package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.application.model.Student;

@Controller
@RequestMapping(value="/")
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "register";
	}
	
	@RequestMapping(value="/registerSuccess")
	public ModelAndView registerSuccess(@RequestParam("name") String name, @RequestParam("email") String email ,@RequestParam("age") int age ,@RequestParam("country") String country) {
		Student student = new Student(name,age,email,country);
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("user",student);
		
		return modelAndView;
	}
	
}
