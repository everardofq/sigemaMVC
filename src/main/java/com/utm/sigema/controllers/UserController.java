package com.utm.sigema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping(value="/getUsers", method = RequestMethod.GET)
	public String student(Model model){
		model.addAttribute("users", new Login());
		return "users";	
	}
}
