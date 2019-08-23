package com.sts.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sts.dao.BoardService;

@Controller
// 원래는 이렇게 잡아야 관리가 편하다. @RequestMapping("/brd")
public class BoardController {
	
	// @autowired DAO 객체 생성
	@Autowired
	private BoardService bDAO;

	//127.0.0.1:8080/web/board.do
	@RequestMapping(value = "/board.do", method = RequestMethod.GET)
	public String boardlist(Model model, HttpSession httpSession) {
		//Model은 어떠한 값을 담아 보내주고자 할때 사용한다.
		
		// 세션에 BRD_HIT_CHECK에 1을 넣는다.
		httpSession.setAttribute("BRD_HIT_CHECK", 1);
		// DB에서 목록을 가져옴
		List<Map<String, Object>> list = bDAO.selectBoardList();
		
		// jsp로 값 전달함.
		model.addAttribute("list", list);
		// board.jsp를 표시
		return "board";
	}
	
	
	// 이 메소드를 잘 보자. 각 객체의 메소드와 그 반환값, parameter를 잘 봐라
	//127.0.0.1:8080/web/boardc.do
	@RequestMapping(value = "/boardc.do", method = RequestMethod.GET)
	public String boardcontent(@RequestParam("no") int no, Model model, HttpSession httpSession) {
		
		// 세션에서 값 꺼내기
		int chk = (Integer)httpSession.getAttribute("BRD_HIT_CHECK");
		if(chk == 1) {
			// 조회수 1 증가 시키기
			int result = bDAO.updateBoardHit(no);
			httpSession.setAttribute("BRD_HIT_CHECK", 0);
			
			// 세션은 한 사람당 하나, 그러나 Attribute는 여러개가 될 수 있다.
			// 세션을 날리고 싶은 경우
			// httpSession.invalidate(); -> 현재 세션을 완전히 지움(로그아웃)
		}
		// 다음 url에 전달해줄 때 Model 객체가 필요하다.
		Map<String, Object> map = new HashMap<String, Object>();
		map = bDAO.selectBoardOne(no);
		
		model.addAttribute("content", map);
		
		// 이전글, 다음글 매핑
		int prev = bDAO.selectBoardPrev(no);
		int next = bDAO.selectBoardNext(no);
		
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		
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
	
	@RequestMapping(value = "/boarde.do", method = RequestMethod.GET)
	public String boardedit(@RequestParam("no") int no, Model model) {
		Map<String, Object> map = bDAO.selectBoardOne(no);
		model.addAttribute("map", map);
		return "boarde";
		//return "redirect:boardc.do?no=" + map.get("BRD_NO");
	}
	
	@RequestMapping(value = "/boarde.do", method = RequestMethod.POST)
	public String boardeditnow(@RequestParam("title") String title, @RequestParam("content") String content,
								@RequestParam("writer") String writer, @RequestParam("no") int no) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("no", no);
		map.put("title", title);
		map.put("content", content);
		map.put("writer", writer);
		
		int ret = bDAO.updateBoardOne(map);
		
		return "redirect:boardc.do?no=" + map.get("no");
	}
}
