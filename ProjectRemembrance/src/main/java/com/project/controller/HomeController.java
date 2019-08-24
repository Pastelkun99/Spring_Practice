package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.dao.User;
import com.project.service.UserServiceimplement;

@Controller
public class HomeController {
	
	@Autowired
	private UserServiceimplement us;
	
	static private PrintWriter writer;
	
	// 메인 화면 처리
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main(Model model, HttpSession httpSession) {
		return "main";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "redirect:/main.do";
	}

	
	// 로그인 처리
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(HttpSession httpSession, HttpServletResponse response) throws Exception {
		if(httpSession.getAttribute("login_check") != null) {
			return "redirect:/main.do";
		}
		return "login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginPost(Model model, @ModelAttribute() User user, HttpSession httpSession) {
		try {
			System.out.println("id : " + user.getUser_id() + " pw : " + user.getUser_pw());
			User tempuser = us.selectUserLogin(user);
			if(user.getUser_pw().equals(tempuser.getUser_pw())) {
				httpSession.setAttribute("login_check", user.getUser_id());
				//System.out.println("세션 받아온 것  : " + httpSession.getAttribute("login_check"));
				model.addAttribute("msg", (String)httpSession.getAttribute("login_check") + "님 로그인되었습니다.");
				model.addAttribute("href", "/remember/main.do");
				return "alert";
			} else {
				model.addAttribute("msg", "로그인에 실패했습니다. 아이디와 비밀번호를 확인해주세요.");
				model.addAttribute("href", "/remember/main.do");
				return "alert";
			}
		}
		catch (Exception e) {
			model.addAttribute("msg", "로그인에 실패했습니다. 아이디와 비밀번호를 확인해주세요.");
			model.addAttribute("href", "/remember/login.do");
			return "alert";
		}
	}
	
	// 회원 등록 페이지 관리
	@RequestMapping(value = "/register.do", method= RequestMethod.GET)
	public String register_user(HttpSession httpSession) {
		return "register";
	}
	
	@RequestMapping(value = "/register.do", method= RequestMethod.POST)
	public String register(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		us.insertUserOne(user);
		model.addAttribute("msg", "회원 등록에 성공했습니다. 새로운 아이디로 로그인해주세요.");
		model.addAttribute("href", "/remember/login.do");
		return "alert";
	}
	
	// 회원 등록 페이지 관리 시 상호작용 목적
	@RequestMapping(value = "/checkId.do", method= RequestMethod.GET)
	public @ResponseBody int check_user(@ModelAttribute User user, HttpSession httpSession) {
		//System.out.println("restcontroller : " + user.toString());
		User chkuser = us.selectUserOne(user);
		int result = 0;
		if(chkuser != null) {
			// 일치하는 아이디 없을 경우 ( 회원등록 가능)
			result = 1;
		}
		return result;
	}
	
	
	// 로그아웃 처리
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession httpSession, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		httpSession.invalidate();
		model.addAttribute("msg", "로그아웃 되었습니다.");
		model.addAttribute("href", "/remember/main.do");
		// 절대경로는 request.getContextPath(); 사용할것
		return "alert";
	}
	
	
}
