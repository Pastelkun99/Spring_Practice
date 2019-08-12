package org.mywish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Pistol/*")
public class PistolController {

	@RequestMapping(value = "/G18C", method = RequestMethod.GET)
	public String g18c() {
		return "Pistol/G18C";
	}
}
