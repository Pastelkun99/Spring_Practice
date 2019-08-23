package com.sts.web;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.sts.dao.MemberService;
import com.sts.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/memberimg.do", method = RequestMethod.GET)
	public ResponseEntity<byte[]> memberimg(@RequestParam("id") String id) {
		try {
			Member vo = memberService.selectMemberImg(id); //String으로 id가 넘어가면 img가 넘어옴
			
			// 이 아래의 문법은 거의 고정이다.mediatype의 상수만 바뀔 뿐
			HttpHeaders header = new HttpHeaders();
			header.setContentType(MediaType.MULTIPART_FORM_DATA);
			
			//byte[]를 이미지로 변환해서 전달한다.
			return new ResponseEntity<byte[]>(vo.getMem_img(), header, HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public ModelAndView join(Model model, HttpSession httpSession) {
		// 첫번째 인자 : view 파일 이름
		// 두번째 인자 : model 명칭
		// 세번째 인자 : view에서 값을 보관할 vo 객체
		
		return new ModelAndView("join", "cmd", new Member());
	}
	
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String join(@ModelAttribute("cmd") Member mem, MultipartHttpServletRequest request) {
		MultipartFile file = request.getFile("mem_img1"); // 이전 url에서 mem_img1로 보내준 것을 file 변수에 넣는다.
		try {
			mem.setMem_img(file.getBytes()); // mem_img1을 mem_img로 집어넣어줌. 이름이 달랐다고 헷갈리지말자.
			System.out.println(file.getOriginalFilename());
			memberService.insertMemberOne(mem);
			// memberserver.java와 memberdao, membermapper 만들기
			// INSERT INTO MEMBER VALUES(#{mem_id}, #{mem_pw}, #{mem_name}, #{mem_img, jdbcType=BLOB}, SYSDATE)
			return "redirect:join.do";
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return "redirect:join:do";
		}
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(Model model, HttpSession httpSession) {
		return "login";
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Model model, HttpSession httpSession) {
		return "";
	}
	
}
