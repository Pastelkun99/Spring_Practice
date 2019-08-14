package com.sts.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sts.dao.BoardService;

@Controller
public class BoardController {
	
	// @autowired DAO 객체 생성
	@Autowired
	private BoardService bDAO;

	//127.0.0.1:8080/web/board.do
	@RequestMapping(value = "/board.do", method = RequestMethod.GET)
	public String boardlist(Model model) {
		
		// DB에서 목록을 가져옴
		List<Map<String, Object>> list = bDAO.selectBoardList();
		// jsp로 값 전달함.
		model.addAttribute("list", list);
		// board.jsp를 표시
		return "board";
	}
	
	//127.0.0.1:8080/web/boardc.do
	@RequestMapping(value = "/boardc.do", method = RequestMethod.GET)
	public String boardcontent() {
		return "boardc";
	}
	
	//127.0.0.1:8080/web/boardw.do
	@RequestMapping(value = "/boardw.do", method = RequestMethod.GET)
	public String boardwrite() {
		return "boardw";
	}
	
	@RequestMapping(value = "/boardw.do", method = RequestMethod.POST)
	public String boardwrite(@RequestParam("title") String a, 
							 @RequestParam("content") String b, 
							 @RequestParam("writer") String c)	{
		
		// DB에 추가함
		// DAO로 전달 -> dao가 mapper로 전달. -> mapper SQL문을 수행
		// insert, delete, update -> return 값은 (0 or 1),
		// select 는 결과값이 0또는 1이 아니다.
		
		
		// map 또는 VO 사용
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("TI", a);
		map.put("CO", b);
		map.put("WR", c);
		
		int ret = bDAO.insertBoardOne(map);
		
		return "redirect:board.do";
	}
}
