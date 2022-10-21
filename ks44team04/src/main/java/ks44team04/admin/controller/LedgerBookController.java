package ks44team04.admin.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.dto.Order;
import ks44team04.service.LedgerBookService;

@Controller
@RequestMapping("/admin")
public class LedgerBookController {
	
	private LedgerBookService ledgerBookService;
	
	public LedgerBookController(LedgerBookService ledgerBookService) {
		this.ledgerBookService = ledgerBookService;
	}
	
	//판매자 장부 매인화면 
	@GetMapping("/ledgerBook/sellerBook")
	public String lederBook(Model model, HttpSession session) {
		
		 String sellerId = (String) session.getAttribute("SID");
		 
		 Map<String, Object> orderMap = new HashMap<String, Object>();
		 orderMap.put("sellerId", sellerId);
		 //판매자 메인 화면 상단 부분 
		 List<Order> mainTop = ledgerBookService.mainTop(orderMap);
		 
		 //판매자 메인 화면 2022 결제 금액 테이블
		 List<Order> orderList = ledgerBookService.orderList(orderMap);	
		 
		 //판매자 메인 화면 2022년 할인 통계 포인트 부분
		 List<Order> pointDiscountlist = ledgerBookService.pointDiscountlist(orderMap);
		 
		 //판매자 메인 화면에 차트 부분
		 List<Order> mainCartList = ledgerBookService.mainCartList(orderMap);
		 
		 model.addAttribute("title", "판매자 장부"); 
		 model.addAttribute("mainTop", mainTop);
		 model.addAttribute("orderList", orderList);
		 model.addAttribute("pointDiscountlist", pointDiscountlist);
		 model.addAttribute("mainCartList", mainCartList);
		
		
		return "admin/ledgerBook/sellerBook";
	}
	
	@GetMapping("/ledgerBook/salesStatistics")
	public String salesStatistics(Model model, HttpSession session) {
		
		String sellerId = (String) session.getAttribute("SID");
		 
		 Map<String, Object> orderMap = new HashMap<String, Object>();
		 orderMap.put("sellerId", sellerId);
		 //판매자 매출 통계 카테고리별 결제 금액 그래프(비율포함)
		 List<Order> paymentAmount = ledgerBookService.paymentAmount(orderMap);	
		 
		 //판매자 매출 통계 카테고리별 교환 테이블 부분
		 Map<String, Object> orderExchangeMap = ledgerBookService.orderExchange(orderMap);	
		 
		 //판매자 매출 통계 카테고리별 반품 테이블 부분 
		 Map<String, Object> orderReturnMap = ledgerBookService.orderReturn(orderMap);		
		 
		 //
		 Map<String, Object> paymentAmountTableMap = ledgerBookService.paymentAmountTable(orderMap);		
		 
		model.addAttribute("title", "매출 통계");
		
		model.addAttribute("paymentAmount", paymentAmount);
		
		model.addAttribute("orderExchange", orderExchangeMap.get("orderExchange"));
		model.addAttribute("cateInfoListEx", orderExchangeMap.get("cateInfoListEx"));
		
		model.addAttribute("orderReturn", orderReturnMap.get("orderReturn"));
		model.addAttribute("cateInfoList", orderReturnMap.get("cateInfoList"));
		
		model.addAttribute("paymentAmountTable", paymentAmountTableMap.get("paymentAmountTable"));
		model.addAttribute("cateInfoMonth", paymentAmountTableMap.get("cateInfoMonth"));
		
		return "admin/ledgerBook/salesStatistics";
	}
	
	@GetMapping("/ledgerBook/ageAreaStatistics")
	public String ageAreaStatistics(Model model) {
		
		model.addAttribute("title", "연령/지역별 통계");
		
		return "admin/ledgerBook/ageAreaStatistics";
	}
	
}
