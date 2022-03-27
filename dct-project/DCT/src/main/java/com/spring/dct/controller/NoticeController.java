package com.spring.dct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.dct.freeboard.service.IFreeBoardService;
import com.spring.dct.notice.service.INoticeService;
import com.spring.dct.util.PageCreator;
import com.spring.dct.util.PageVO;
import com.spring.dct.vo.CommunitiesVO;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	
	@GetMapping("/introduce")
	public String introduce() {
		System.out.println("소개 - introduce");
		return "notice/introduce";
	}
	
	@GetMapping("/frequentqna")
	public String freequenceqna() {
		System.out.println("자주하는 질문 - frequentqna");
		return "notice/frequentqna";
	}


	@Autowired
	private INoticeService service;

	// 목록 화면
	@GetMapping("/noticeList")
	public String noticeList(PageVO vo, Model model) {

		System.out.println("검색어: " + vo.getKeyword());
		System.out.println("검색 조건: " + vo.getCondition());

		PageCreator pc = new PageCreator();
		pc.setPaging(vo);
		pc.setArticleTotalCount(service.getTotal(vo));

		System.out.println(pc);

		model.addAttribute("noticeList", service.getList(vo));
		model.addAttribute("pc", pc);

		System.out.println(service.getList(vo));

		return "notice/noticeList";
	}


	// 글 상세보기 처리
	@GetMapping("/noticeDetail")
	public void getContent(@RequestParam("bno") int bno, @ModelAttribute("p") PageVO vo, Model model) {
		model.addAttribute("article", service.getContent(bno));
	}


}
