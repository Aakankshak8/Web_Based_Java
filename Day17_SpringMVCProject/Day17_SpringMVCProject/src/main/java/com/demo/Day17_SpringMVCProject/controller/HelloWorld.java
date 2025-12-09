package com.demo.Day17_SpringMVCProject.controller;

import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorld {
	
	public ModelAndView sayhello() {
		String msg="Hello Didi";
		return new ModelAndView ("hello","message",msg);
	}

}
