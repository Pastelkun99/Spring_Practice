package org.mywish.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/G18C", method = RequestMethod.GET)
	public String G18C() {
		return "G18C";
	}
	
	@RequestMapping(value = "/assultrifle", method = RequestMethod.GET)
	public String assultrifle() {
		return "assultrifle";
	}
	
	
}
