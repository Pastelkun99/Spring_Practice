package org.mywish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Assultrifle/*")
public class AssultrifleController {

	@RequestMapping(value = "/ar15taranTactical", method = RequestMethod.GET)
	public String ar15taranTactical() {
		return "Assultrifle/ar15taranTactical";
	}
	
	@RequestMapping(value = "/ak47", method = RequestMethod.GET)
	public String ak47() {
		return "Assultrifle/ak47";
	}
	
	@RequestMapping(value = "/ACR")
	public String acr() {
		return "Assultrifle/ACR";
	}
	
	@RequestMapping(value = "/TAR21")
	public String tar21() {
		return "Assultrifle/TAR21";
	}
	
	
}
