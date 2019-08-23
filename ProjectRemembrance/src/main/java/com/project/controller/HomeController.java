package com.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dao.User;
import com.project.service.UserServiceimplement;

@Controller
public class HomeController {
	
	@Autowired
	private UserServiceimplement us;
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main(Model model, HttpSession httpSession) {
		return "main";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "main";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(HttpSession httpSession) {
		return "login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginPost(Model model, @ModelAttribute User user, HttpSession httpSession) {
		try {
			System.out.println("id : " + user.getUser_id() + " pw : " + user.getUser_pw());
			User tempuser = us.selectUserLogin(user);
			if(user.getUser_pw().equals(tempuser.getUser_pw())) {
				httpSession.setAttribute("login_check", user.getUser_id());
				System.out.println("세션 받아온 것  : " + httpSession.getAttribute("login_check"));
				return "redirect:/";
			} else {
				System.out.println("로그인에 실패하였습니다.");
				return "loginFail";
			}
		}
		catch (Exception e) {
			System.out.println("로그인에 실패하였습니다.");
			return "loginFail";
		}
	}
	
	@RequestMapping(value = "/loginFail.do", method = RequestMethod.GET)
	public String loginfail() {
		return "login";
	}
	
	@RequestMapping(value = "/register.do", method= RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	@RequestMapping(value = "/register.do", method= RequestMethod.POST)
	public String register_user(@ModelAttribute User user, HttpSession httpSession) {
		System.out.println(user.toString());
		us.insertUserOne(user);
		return "register";
	}
	
	
	
}
