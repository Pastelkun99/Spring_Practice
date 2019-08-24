package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/word")
public class WordController {
	
	@RequestMapping(value = "/wordstart.do", method = RequestMethod.GET)
	public String ajaxEx() {
		return "/word/word";
	}
	
}
