package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElienController {
	
	
	  @RequestMapping(value = "/jsp", method = RequestMethod.GET) 
	  public String home()
	  { 
		  return "home";
		  
	  }
	  
	
	
	
	
	
	
	/*
	 * @RequestMapping(value="/d") public String display() { return "home }
	 */
}


/*
 * @RequestMapping(value = "/jsp", method = RequestMethod.GET) public String
 * home(){ return "/webapp/WEB-INF/home.jsp"; }
 */ 