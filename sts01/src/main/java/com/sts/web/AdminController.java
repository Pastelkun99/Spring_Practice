package com.sts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sts.dao.MemberDAO;
import com.sts.dao.MemberService;
import com.sts.vo.Member;

@Controller
public class AdminController {
	
	@Autowired
	private MemberDAO memberdao;
	
	// 127.0.0.1:8080/web/admin.do
	@RequestMapping(value = "/admin.do", method = RequestMethod.GET)
	public String admin(@RequestParam(value="menu", defaultValue = "0", required = false) int no,
						Model model) {
						// requestparam이 들어오는데 이 값은 없어도 된다. 그렇다면 디폴트 값으로 1을 넣어라.
		if(no == 0) { // menu가 입력되지 않으면 강제로 2번으로 넘어가게 함.
			return "redirect:admin.do?menu=2";
		} else if(no == 1) {
			List<Member> list = memberdao.selectMemberList();
			System.out.println(list.get(0));
			model.addAttribute("list", list);
		}
		
		return "admin";
	}
}
