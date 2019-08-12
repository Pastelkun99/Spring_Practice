package org.mywish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Shotgun/*")
public class ShotgunController {

	@RequestMapping(value = "/M1014")
	public String m1014() {
		return "Shotgun/M1014";
	}
	
	@RequestMapping(value = "/SPAS-12")
	public String spas12() {
		return "Shotgun/SPAS-12";
	}
}
