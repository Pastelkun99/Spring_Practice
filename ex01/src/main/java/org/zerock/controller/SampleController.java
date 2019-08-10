package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.TodoDTO;


@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@RequestMapping("")
	public void basic() {
		// 개인정보 입력 부름
		System.out.println("basic");
	}
	
	@RequestMapping("/sooryong")
	public String sooRyong() {
		System.out.println("수령님 사진 출력");
		return "sample/sooryong";
	}
	
	@RequestMapping("/kim")
	public String kimjeongun() {
		System.out.println("위대한 수령 김정은");
		return "sample/kimjeongun";
	}
	
	@RequestMapping("/ex01")
	public void ex01(SampleDTO dto) {
		System.out.println(dto);
	}
	
	@RequestMapping("/ex02List")
	public void ex02List(@RequestParam("ids") ArrayList<String> ids) {
		System.out.println(ids);
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		System.out.println("ex03호출");
		return "ex03";
	}
	
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		System.out.println("dto : " + dto);
		System.out.println("page : " + page);
		return "sample/ex04";
	}
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		System.out.println("ex06");
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");
		dto.setGender("남성");
		return dto;
	}
	
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07() {
		System.out.println("ex07");
		String msg = "{\"name\": \"홍길동\"}";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}
	
	@GetMapping("/exUpload")
	public void exUpload() {
		System.out.println("exupload 실행");
	}
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
		files.forEach(file->{
				System.out.println("--------------------------------------");
				System.out.println("name : " + file.getOriginalFilename());
				System.out.println("size : " + file.getSize());
			
		});
	}
	
	
}
