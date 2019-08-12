package org.mywish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/assultrifle/*")
public class AssultRifleController {

	@RequestMapping(value = "/ar15taranTactical", method = RequestMethod.GET)
	public String ar15taranTactical() {
		return "ar15taranTactical";
	}
	
	@RequestMapping(value = "/ak47", method = RequestMethod.GET)
	public String ak47() {
		return "ak47";
	}
	
	@RequestMapping(value = "/ACR")
	public String acr() {
		return "ACR";
	}
	
	
	
}
