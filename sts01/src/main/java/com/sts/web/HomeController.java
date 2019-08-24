package com.sts.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sts.exception.PageNotFoundException;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		return "home";
	}

	// { } 로 변수화 시킴
	// 127.0.0.1:8080/web/board1.do
	@RequestMapping(value = "/{page}", method = RequestMethod.GET)
	public String page(@PathVariable("page") String page) {
		// page
		if (page.equals("home")) { // home.do
			return "home";
		} else {
			throw new PageNotFoundException();
		}
	}

	@ExceptionHandler(PageNotFoundException.class)
	public String pageNotFound() {
		return "page404";
	}

	
	
	
	// 접근권한 불가 페이지 설정
	@RequestMapping(value = "/error403.do", method = RequestMethod.GET)
	public String error403() {
		return "security/error403";
	}

	// 접근권한 불가 페이지 설정
	@RequestMapping(value = "/main1.do", method = RequestMethod.GET)
	public String main1() {
		return "security/main1";
	}
	
	@RequestMapping(value = "/login1.do", method = RequestMethod.GET)
	public String login1() {
		return "security/login1";
	}
	
	@RequestMapping(value = "/admin/mypage.do", method = RequestMethod.GET)
	public @ResponseBody String adminmypage() {
		return "admin page";
	}
	
	@RequestMapping(value = "/teacher/mypage.do", method = RequestMethod.GET)
	public @ResponseBody String teachermypage() {
		return "teacher page";
	}
	
	@RequestMapping(value = "/student/mypage.do", method = RequestMethod.GET)
	public @ResponseBody String studentmypage() {
		return "student page";
	}
}
