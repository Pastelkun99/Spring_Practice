package com.sts.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sts.vo.MavVO;

@Controller
public class MAVController {

	@RequestMapping(value="/mav_select.do", method = RequestMethod.GET)
	public String select(Model model) {
		List<String> selectItem = new ArrayList<String>();
		selectItem.add("java");
		selectItem.add("C");
		selectItem.add("nodejs");
		selectItem.add("react");
		selectItem.add("oracle");
		
//		MavVO vo = new MavVO();
//		vo.setId("aaaa");
//		vo.setLanguage("nodejs");
		
		model.addAttribute("vo", new MavVO());
		model.addAttribute("select_list", selectItem);
		
		return "mav_select";
	}
	
	@RequestMapping(value="/mav_select.do", method = RequestMethod.POST)
	public String select(@ModelAttribute("vo") MavVO vo) {
		System.out.println(vo.toString());
		return "redirect:mav_select.do";
	}
	
}
