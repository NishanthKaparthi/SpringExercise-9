package com.montrealcollege.exercise9.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = {"/hello"})
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message", "Hello BadBitch");
		return "hello";
	}
	@RequestMapping(path = "/world", method = RequestMethod.GET)
	public String sayHelloWorld(ModelMap model) {
		model.addAttribute("message", "HelloWorldSpringMVC!!");
		return "hello";
	}
}
