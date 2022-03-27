package com.spring.dct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {

	@GetMapping("/notice01")
	public String F() {
		System.out.println("공지사항 - notice01");
		return "notice/notice01";
	}
	
	@GetMapping("/introduce")
	public String introduce() {
		System.out.println("소개 - introduce");
		return "notice/introduce";
	}
	
	@GetMapping("/freequenceqna")
	public String freequenceqna() {
		System.out.println("자주하는 질문 - freequnceqna");
		return "notice/freequenceqna";
	}
}
