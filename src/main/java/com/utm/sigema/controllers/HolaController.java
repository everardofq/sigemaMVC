package com.utm.sigema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {
	
	@RequestMapping("getSaludo")
	public ModelAndView redireccion(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hola");
		
		return mv;
	}
	
}
