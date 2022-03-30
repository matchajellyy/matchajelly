package com.spring.dct.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dct.cart.service.ICartService;
import com.spring.dct.vo.CartsVO;
import com.spring.dct.vo.UsersVO;

@Controller
@RequestMapping("/order")
public class CartsController {
	
	@Autowired
	private ICartService service;
	
	@GetMapping("/carts")
	public void carts() {}
	
	// 장바구니에 담기
	@PostMapping("/addCart")
	public String addCarts(CartsVO vo) {
		service.addCart(vo);
		System.out.println("addCarts POST ");
		return "redirect:/lecture/lecturePage"; 
		
	}
	
	//구매하기
	@PostMapping("/addPurchases")
	public String addPurchases(CartsVO vo) {
		
		service.addCart(vo);
				
		return "redirect:/order/afterPurchases";
		
	}
	
	@GetMapping("/afterPurchases")
	public String afterPurchases(HttpSession session, Model model) {
		int userNo = ((UsersVO) session.getAttribute("login")).getUserNo();
		
		model.addAttribute("carts", service.getCartItemsByUserNo(userNo));
		
		return "order/carts";

	}
	
	
	
	// 장바구니 삭제
	@PostMapping("/deleteCart")
	@ResponseBody
	public int deleteCart(@RequestBody CartsVO vo, HttpSession session) {
		
		System.out.println("/deleteCart vo: " + vo);
		
		service.deleteCart(vo);
	
		return 1;
	}
	
	
	// 장바구니 전체 삭제
	@PostMapping("/deleteCartAll")
	@ResponseBody
	public int deleteCartAll(@RequestBody CartsVO vo, HttpSession session) {
		
		int userNo = ((UsersVO) session.getAttribute("login")).getUserNo();
		
		service.deleteAllCart(userNo);
		
		return 1;
	}
	
}
