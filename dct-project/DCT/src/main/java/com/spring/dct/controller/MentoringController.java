package com.spring.dct.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dct.mentoring.service.IMentoringService;
import com.spring.dct.util.PageCreator;
import com.spring.dct.util.PageVO;
import com.spring.dct.vo.MentoringReplyVO;
import com.spring.dct.vo.MentoringsVO;



@Controller
@RequestMapping("/mentor")
public class MentoringController {

	@Autowired
	private IMentoringService service;
	
	
	//강의 수강평 화면 처리
	@GetMapping("/mentoringWrite")
	public void mentoringWrite() {
		System.out.println("/mentor/mentoringWrite: GET");
	}
	
	//멘토링 글 등록
	@PostMapping("/mentorRegist")
	public String mentorRegist(MentoringsVO vo) {
		System.out.println("멘토링 글 등록 요청 들어옴!");
		System.out.println("param: " + vo);
		service.regist(vo);
		
		return "redirect:/mentor/mentoringList";
	}
	
	//멘토링 리스트 화면
	@GetMapping("/mentoringList")
	public String mentoringPage(PageVO vo, Model model) {
		System.out.println("/lecture/mentoringPage: GET");
		
		System.out.println("페이지 번호: " + vo.getPageNum());
		System.out.println("검색어: " + vo.getKeyword());
		System.out.println("검색조건: " + vo.getCondition());
		System.out.println("categoryNum: " + vo.getCategoryNum());
		
		
		PageCreator pc = new PageCreator();
		
		pc.setPaging(vo);
		pc.setArticleTotalCount(service.getTotal(vo));
		
		System.out.println(pc);
		
		List<MentoringsVO> list = new ArrayList<>();
		list = service.getList(vo);
		System.out.println(list);
		
		for(MentoringsVO up : list) {
			System.out.println(up.toString());
		}
		
		model.addAttribute("mentoringList", list);
		model.addAttribute("pc", pc);
		
		return "mentor/mentoringList";
		
	}
	
	//모달에 띄울 내용 비동기로 얻어오기
	@GetMapping("/mentoringModal/{mentoringNo}")
	@ResponseBody
	public MentoringsVO mentoringModal(@PathVariable int mentoringNo) {
		System.out.println("모달 요청!");
		return service.getContent(mentoringNo);
	}
	

	//멘토링 상세 화면
	@GetMapping("/mentoringDetail")
	public void mentoringDetailPage(int mentoringNo, Model model) {
		System.out.println("/mentor/mentorDetail: GET");
		
		MentoringsVO vo = service.getContent(mentoringNo);
		List<Integer> ratings = service.getAllRatings(mentoringNo);
		
		List<Integer> percentage = new ArrayList<>();
		
		for(int i=1; i<=5; i++) {
			double num = (double)Collections.frequency(ratings, i) / ratings.size();
			percentage.add((int) (num * 100));
		}
		
		System.out.println(percentage);
		
		int total = 0;
		Collections.sort(ratings);
		for(int rate : ratings) {
			total += rate;
		}
		
		if(ratings.size() != 0) {
			vo.setMentoringLike(total / ratings.size());			
		} else {
			vo.setMentoringLike(total);
		}
		
		model.addAttribute("mentoringArticle", vo);
		model.addAttribute("ratings", ratings);
		model.addAttribute("percentage", percentage);
		
	}

	
	//수강평 댓글 확인
	@PostMapping("/replyRegist")
	@ResponseBody
	public String replyRegist(@RequestBody MentoringReplyVO vo) {
		System.out.println("멘토링 수강평 댓글 등록 요청!");
		System.out.println(vo);
		
		service.replyRegist(vo);
		
		return "success";
		
	}
	
	@GetMapping("/replyList/{mentoringNo}/{pageNum}")
	@ResponseBody
	public Map<String, Object> replyList(@PathVariable int mentoringNo, @PathVariable int pageNum) {
		
		PageVO vo = new PageVO();
		vo.setPageNum(pageNum);
		vo.setCountPerPage(5);
		
		List<MentoringReplyVO> list = service.replyList(vo, mentoringNo);
		int total = service.getReplyTotal(mentoringNo);
		
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("total", total);
		
		return map;
		
	}
	
	//댓글 수정
	@PostMapping("/replyUpdate")
	@ResponseBody
	public String replyUpdate(@RequestBody MentoringReplyVO vo) {
		
		System.out.println("댓글 수정 요청이 들어옴!");
		
		System.out.println(vo);
		
		service.replyUpdate(vo);
		
		return "modSuccess";
	}

	
	//댓글 삭제
	@PostMapping("/replyDelete")
	@ResponseBody
	public String replyDelete(MentoringReplyVO vo) {
		
		System.out.println("댓글 삭제 요청 들어옴!");
		service.replyDelete(vo.getRno());
		
		return "delSuccess";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
