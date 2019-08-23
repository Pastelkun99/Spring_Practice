package com.sts.shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sts.dao.Shop_MemberDAO;
import com.sts.vo.Shop_Member;

@Controller
@RequestMapping("/mem")
public class Shop_MemberController {

	@Autowired
	private Shop_MemberDAO smdao;

	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public String join(Model model, HttpSession httpSession) {
		return "shop/join";
	}

//  map으로 하는 경우
//	@RequestMapping(value="/join.do", method = RequestMethod.POST)
//	public String join(@RequestParam Map<String, Object> map) {
//		System.out.println(map);
//		smdao.insertMemberOne(map);
//		return "redirect:/main.do";
//	}

	// vo객체로 하는 경우
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String join(@ModelAttribute Shop_Member vo) {
		System.out.println(vo.toString());
		smdao.insertMemberOneVo(vo);
		return "redirect:/main.do";
	}

	// vo객체로 하는 경우
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(Model model, HttpSession httpSession) {
		return "shop/login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(@RequestParam Map<String, Object> map, HttpSession httpSession) {
		System.out.println(map);
		Map<String, Object> resultmap = smdao.selectMemberLogin(map);
		System.out.println(resultmap);
		
		if(map.get("userName").equals(resultmap.get("MEM_ID"))) {
			// 로그인 성공
			httpSession.setAttribute("S_ID", resultmap.get("MEM_ID"));
			httpSession.setAttribute("S_NA", resultmap.get("MEM_NAME"));
			return "redirect:/mem/main.do";
		} else {
			System.out.println("로그인 안됨");
			return "redirect:/mem/login.do";
		}
	}
	
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.invalidate();
		return "redirect:/mem/main.do";
	}
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Model model) {
		List<Map<String, Object>> list = smdao.selectMemberList();
		model.addAttribute("list", list);
		return "shop/list";
		
	}
}
