package org.zerock.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	private BoardService service;
	
	@GetMapping("/list")		// 목록보기
	public void list(Model model) {
		log.info("list");
		List<BoardVO> list = service.getList();
		
		model.addAttribute("list", list);
	}
	
	@GetMapping("/list2")		// 목록보기
	public void list2(Model model) {
		log.info("list2");
		List<BoardVO> list = service.getList();
		
		model.addAttribute("list2", list);
	}
	
	@PostMapping("/register")		// 글쓰기
	public String register(BoardVO board, RedirectAttributes rttr) {
		System.out.println("등록 : " + board);
		
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/get")			//글읽기
	public void get(@RequestParam("bno") int bno, Model model) {
		System.out.println("/get");
		model.addAttribute("board", service.get(bno));
	}
	
	@PostMapping("/modify")		//글 수정
	public String modify(BoardVO board, RedirectAttributes rttr) {
		System.out.println("수정 : " + board);
		
		if(service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")		// 글 삭제
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) {
		System.out.println("삭제 : " + bno);
		if(service.remove(bno)) {
			rttr.addAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
}
